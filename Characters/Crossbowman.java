package Characters;

import Map.Cell;

public class Crossbowman extends RangedFighterType {
    String getCharacterTypeName() {
        return "Арбалетчик";
    }

    public Crossbowman(Cell pos, String name) {
        super(pos, name, 75, 75, 8, 5, 10);
    }

    @Override
    public void performRangedAttack(CharacterInterface target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'performRangedAttack'");
    }

    @Override
    public void requestAmmunition(CharacterInterface target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'requestAmmunition'");
    }

    @Override
    public boolean checkAmmunition(CharacterInterface target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'checkAmmunition'");
    }
}
