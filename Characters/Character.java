package Characters;

import java.util.ArrayList;

import Map.Cell;
import Map.GameMap;

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

    @Override
    public String toString() {
        return getCharacterTypeName() + ": " + getName();
    }

    @Override
    public Boolean isAlive() {
        return hp > 0;
    }

    @Override
    public void step(GameMap map, ArrayList<CharacterInterface> friends, ArrayList<CharacterInterface> enemies) {
        System.out.println(this + " пропускает ход");
    }

    protected void moveTo(GameMap map, Cell target) {
        if (position.getX() > target.getX() && moveTo(map, position.getX() - 1, position.getY())) {
            System.out.println(this + " передвинулся вниз");
        } else if (position.getX() < target.getX() && moveTo(map, position.getX() + 1, position.getY())) {
            System.out.println(this + " передвинулся вверх");
        } else if (position.getY() > target.getY() && moveTo(map, position.getX(), position.getY() - 1)) {
            System.out.println(this + " передвинулся влево");
        } else if (position.getY() < target.getY() && moveTo(map, position.getX(), position.getY() + 1)) {
            System.out.println(this + " передвинулся вправо");
        } else {
            System.out.println(this + " не может двигаться");
        }
    }

    private boolean moveTo(GameMap map, int x, int y) {
        Cell newCell = new Cell(x, y);
        if (map.moveTo(this, newCell.getX(), newCell.getY())) {
            position = newCell;
            return true;
        }
        return false;
    }
}