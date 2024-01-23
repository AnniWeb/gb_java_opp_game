package Characters;

import Map.Cell;

public class Rogue extends MeleeFighterType {
    String getCharacterTypeName() {
        return "Разбойник";
    }

    public Rogue(Cell pos, String name) {
        super(pos, name, 150, 150, 20, 5);
    }

    @Override
    public void performMeleeAttack(CharacterInterface target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'performMeleeAttack'");
    }
    
}
