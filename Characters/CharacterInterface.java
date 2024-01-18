package Characters;

public interface CharacterInterface {

    String getName();

    void attack(CharacterInterface target);

    void healing(CharacterInterface target);
    
    void moveTo();
}
