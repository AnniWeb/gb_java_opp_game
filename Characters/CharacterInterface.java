package Characters;

import java.util.ArrayList;

import Map.Cell;

public interface CharacterInterface {

    String getName();

    Cell getPosition();

    Boolean isAlive();

    Integer getInitiative();

    void step(ArrayList<CharacterInterface> friends, ArrayList<CharacterInterface> enemies);
}
