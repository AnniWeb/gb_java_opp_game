package Characters;

/**
 * Character
 */
public abstract class Character implements CharacterInterface {
    protected String name;
    protected int hp;
    protected int maxHp;
    protected int armor;

    public Character (String name, int hp, int maxHp, int armor) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.armor = armor;
    }

    abstract String getCharacterTypeName();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void attack(CharacterInterface target)
    {
        System.out.println("Метод атаки в разработке");
    }

    @Override
    public void healing(CharacterInterface target)
    {
        System.out.println("Метод лечения в разработке");
    }
    
    @Override
    public void moveTo()
    {
        System.out.println("Метод передвижения в разработке");
    }

    @Override
    public String toString() {
        return getCharacterTypeName() + ": " + getName();
    }
}