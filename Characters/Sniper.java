package Characters;

public class Sniper extends RangedFighterType {
    String getCharacterTypeName() {
        return "Снайпер";
    }

    public Sniper(String name) {
        super(name, 90, 90, 2, 10);
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