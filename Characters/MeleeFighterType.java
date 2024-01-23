package Characters;

import java.util.ArrayList;

import Map.Cell;
import Map.GameMap;

public abstract class MeleeFighterType extends Character
{
    protected int strength;

    public MeleeFighterType(Cell pos, String name, int hp, int maxHp, int armor, int strength) {
        super(pos, name, 2, hp, maxHp, armor);
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void step(GameMap map, ArrayList<CharacterInterface> friends, ArrayList<CharacterInterface> enemies) {
        if (isAlive()) {
            CharacterInterface enemy = findNearestEnemy(enemies);
            if (enemy != null) {
                if (position.calculateDistance(enemy.getPosition()) > 1) {
                    moveTo(map, enemy.getPosition());
                } else {
                    performMeleeAttack(enemy);
                }
            }
        }
    }

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

    /**
     * Атаковать цель оружием ближнего боя
     * @param target
     */
    private void performMeleeAttack(CharacterInterface target) {
        System.out.println(this + ": атакует в " + target + " с силой: " + strength);
    }
}
