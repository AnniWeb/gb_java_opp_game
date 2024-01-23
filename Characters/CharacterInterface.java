package Characters;

import java.util.ArrayList;

import Map.Cell;
import Map.GameMap;

public interface CharacterInterface {

    String getName();

    Cell getPosition();

    Boolean isAlive();

    Integer getInitiative();

    void step(GameMap map, ArrayList<CharacterInterface> friends, ArrayList<CharacterInterface> enemies);
}
