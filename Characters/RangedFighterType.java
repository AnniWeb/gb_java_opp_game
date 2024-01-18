package Characters;

public abstract class RangedFighterType extends Character
{
    protected int agility;

    public RangedFighterType(String name, int hp, int maxHp, int armor, int agility) {
        super(name, hp, maxHp, armor);
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
}
