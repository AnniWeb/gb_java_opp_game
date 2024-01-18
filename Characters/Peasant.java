package Characters;

public class Peasant extends Character {
    String getCharacterTypeName() {
        return "Крестьянин";
    }

    public Peasant(String name) {
        super(name, 40, 40, 0);
    }
    
}
