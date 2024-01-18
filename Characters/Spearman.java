package Characters;

public class Spearman extends MeleeFighterType {
    String getCharacterTypeName() {
        return "Копейщик";
    }

    public Spearman(String name) {
        super(name, 200, 200, 50, 10);
    }

    @Override
    public void performMeleeAttack(CharacterInterface target) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'performMeleeAttack'");
    }
    
}
