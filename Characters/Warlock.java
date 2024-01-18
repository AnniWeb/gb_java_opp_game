package Characters;

public class Warlock extends WizardType {
    String getCharacterTypeName() {
        return "Колдун";
    }

    public Warlock(String name) {
        super(name, 70, 70, 2, 50, 100, 15);
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
