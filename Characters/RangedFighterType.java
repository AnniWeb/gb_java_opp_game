package Characters;

import java.util.ArrayList;

import Map.Cell;

public abstract class RangedFighterType extends Character
{
    protected int agility;

    public RangedFighterType(Cell pos, String name, int hp, int maxHp, int armor, int agility) {
        super(pos, name, hp, maxHp, armor);
        this.agility = agility;
    }

    /**
     * Получить значение ловкости
     * @return
     */
    public int getAgility() {
        return agility;
    }

    /**
     * Атаковать выстрелом цель
     * @param target
     */
    abstract void performRangedAttack(CharacterInterface target);

    /**
     * Запросить снаряды у цели
     * @param target
     */
    abstract void requestAmmunition(CharacterInterface target);

    /**
     * Проверить наличие снарядок
     * @param target
     * @return
     */
    abstract boolean checkAmmunition(CharacterInterface target);

    /**
     * Найти ближайщего противника
     * @return
     */
    public CharacterInterface findNearestEnemy(ArrayList<CharacterInterface> enemies) {
        if (enemies.size() == 0) {
            return null;
        }
        CharacterInterface enemy = enemies.get(0);
        double minDist = position.calculateDistance(enemy.getPosition());

        for (int i = 1; i < enemies.size(); i++) {
            double dist = position.calculateDistance(enemies.get(i).getPosition());
            if (minDist > dist) {
                minDist = dist;
                enemy = enemies.get(i);
            }
        }
        return enemy;
    }
}
