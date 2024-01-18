package Characters;

public class Rogue extends MeleeFighterType {
    String getCharacterTypeName() {
        return "Разбойник";
    }

    public Rogue(String name) {
        super(name, 150, 150, 20, 5);
    }

    @Override
    public void performMeleeAttack(CharacterInterface target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'performMeleeAttack'");
    }
    
}
