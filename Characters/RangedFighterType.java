package Characters;

import java.util.ArrayList;

import Map.Cell;
import Map.GameMap;

public abstract class RangedFighterType extends Character
{
    protected int agility;
    protected int ammunition;

    public RangedFighterType(Cell pos, String name, int hp, int maxHp, int armor, int agility, int ammunition) {
        super(pos, name, 3, hp, maxHp, armor);
        this.agility = agility;
        this.ammunition = ammunition;
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
    private void performRangedAttack(CharacterInterface target) {
        ammunition--;
        System.out.println(this + ": выстрелил в " + target + "; осталось снарядоd: " + ammunition);
        // Todo: реализация нанесения урона
    }

    /**
     * Запросить снаряды у цели
     * @param target
     */
    // abstract void requestAmmunition(CharacterInterface target);

    /**
     * Проверить наличие снарядок
     * @param target
     * @return
     */
    // abstract boolean checkAmmunition(CharacterInterface target);

    /**
     * Найти ближайщего противника
     * @return
     */
    public CharacterInterface findNearestEnemy(ArrayList<CharacterInterface> enemies) {
        if (enemies.size() == 0) {
            return null;
        }
        CharacterInterface enemy = null;
        double minDist = 0;

        for (int i = 0; i < enemies.size(); i++) {
            if (!enemies.get(i).isAlive()) {
                continue;
            }
            double dist = position.calculateDistance(enemies.get(i).getPosition());
            if (minDist == 0 || minDist > dist) {
                minDist = dist;
                enemy = enemies.get(i);
            }
        }
        return enemy;
    }

    @Override
    public void step(GameMap map, ArrayList<CharacterInterface> friends, ArrayList<CharacterInterface> enemies) {
        if (isAlive()){
            if (ammunition > 0){
                CharacterInterface enemy = findNearestEnemy(enemies);
                if (enemy != null) {
                    performRangedAttack(enemy);
                }
            }
        }
    }
}
