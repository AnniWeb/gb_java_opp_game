package Characters;

import java.util.ArrayList;

import Map.Cell;

/**
 * Character
 */
public abstract class Character implements CharacterInterface {
    protected String name;
    protected int hp;
    protected int maxHp;
    protected int armor;
    protected int initiative;
    protected Cell position;

    public Character (Cell pos, String name, int initiative, int hp, int maxHp, int armor) {
        this.name = name;
        this.position = pos;
        this.initiative = initiative;

        this.hp = hp;
        this.maxHp = maxHp;
        this.armor = armor;
    }

    abstract String getCharacterTypeName();

    @Override
    public Integer getInitiative() {
        return initiative;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Cell getPosition() {
        return position;
    }

    // @Override
    // public void attack(CharacterInterface target)
    // {
    //     System.out.println("Метод атаки в разработке");
    // }

    // @Override
    // public void healing(CharacterInterface target)
    // {
    //     System.out.println("Метод лечения в разработке");
    // }
    
    // @Override
    // public void moveTo()
    // {
    //     System.out.println("Метод передвижения в разработке");
    // }

    @Override
    public String toString() {
        return getCharacterTypeName() + ": " + getName();
    }

    @Override
    public Boolean isAlive() {
        return hp > 0;
    }

    @Override
    public void step(ArrayList<CharacterInterface> friends, ArrayList<CharacterInterface> enemies) {
        System.out.println(this + " пропускает ход");
    }
}