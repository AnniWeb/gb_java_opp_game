package Characters;

import Map.Cell;

public class Spearman extends MeleeFighterType {
    String getCharacterTypeName() {
        return "Копейщик";
    }

    public Spearman(Cell pos, String name) {
        super(pos, name, 200, 200, 50, 10);
    }

    @Override
    public void performMeleeAttack(CharacterInterface target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'performMeleeAttack'");
    }
    
}
