package Characters;

import Map.Cell;

public class Monk extends WizardType {
    String getCharacterTypeName() {
        return "Монах";
    }

    public Monk(Cell pos, String name) {
        super(pos, name, 100, 100, 10, 20, 20, 5);
    }

    @Override
    public void castSpellAttack(CharacterInterface target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'castSpellAttack'");
    }

    @Override
    public void castSpellHealing(CharacterInterface target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'castSpellHealing'");
    }
}
