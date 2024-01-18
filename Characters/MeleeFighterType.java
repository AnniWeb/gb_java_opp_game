package Characters;

public abstract class MeleeFighterType extends Character
{
    protected int strength;

    public MeleeFighterType(String name, int hp, int maxHp, int armor, int strength) {
        super(name, hp, maxHp, armor);
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
