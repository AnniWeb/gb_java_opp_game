package Characters;

import Map.Cell;

public abstract class WizardType extends Character {
    protected int mana;
    protected int maxMana;
    protected int iq;

    public WizardType(Cell pos, String name, int hp, int maxHp, int armor, int mana, int maxMana, int iq) {
        super(pos, name, 1, hp, maxHp, armor);
        this.mana = mana;
        this.maxMana = maxMana;
        this.iq = iq;
    }

    public int getMana() {
        return mana;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public int getIq() {
        return iq;
    }

    abstract void castSpellAttack(CharacterInterface target);

    abstract void castSpellHealing(CharacterInterface target);
}
