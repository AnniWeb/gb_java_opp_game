package Characters;

public class Crossbowman extends RangedFighterType {


    String getCharacterTypeName() {
        return "Арбалетчик";
    }

    public Crossbowman(String name) {
        super(name, 75, 75, 8, 5);
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