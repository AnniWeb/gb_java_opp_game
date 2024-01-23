package Characters;

import Map.Cell;

public class Peasant extends Character {
    String getCharacterTypeName() {
        return "Крестьянин";
    }

    public Peasant(Cell pos, String name) {
        super(pos, name, 40, 40, 0);
    }
}
