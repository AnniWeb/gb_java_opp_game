package Characters;

import Map.Cell;

public interface CharacterInterface {

    String getName();

    Cell getPosition();

    void attack(CharacterInterface target);

    void healing(CharacterInterface target);
    
    void moveTo();
}
