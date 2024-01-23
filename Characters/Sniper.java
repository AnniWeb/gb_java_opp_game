package Characters;

import Map.Cell;

public class Sniper extends RangedFighterType {
    String getCharacterTypeName() {
        return "Снайпер";
    }

    public Sniper(Cell pos, String name) {
        super(pos, name, 90, 90, 2, 10, 5);
    }
}
