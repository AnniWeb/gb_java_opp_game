package Characters;

import Map.Cell;

public class Crossbowman extends RangedFighterType {
    String getCharacterTypeName() {
        return "Арбалетчик";
    }

    public Crossbowman(Cell pos, String name) {
        super(pos, name, 75, 75, 8, 5, 10);
    }
}
