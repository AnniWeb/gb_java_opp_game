package Characters;

import Map.Cell;

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

    /**
     * Атаковать цель оружием ближнего боя
     * @param target
     */
    abstract void performMeleeAttack(CharacterInterface target);
}
