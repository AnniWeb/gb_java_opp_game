import java.util.ArrayList;

import Characters.CharacterInterface;
import Map.GameMap;

public class Hero {
    private CharacterInterface character; 
    private ArrayList<CharacterInterface> friends; 
    private ArrayList<CharacterInterface> enemies;
    private GameMap map;

    public Hero(CharacterInterface character, GameMap map, ArrayList<CharacterInterface> friends, ArrayList<CharacterInterface> enemies) {
        this.character = character;
        this.friends = friends;
        this.enemies = enemies;
        this.map = map;
    }

    public void step() {
        if (character != null){
            character.step(map, friends, enemies);
        }
    }

    public Integer getInitiative() {
        return character == null ? 0 : character.getInitiative();
    }
}
