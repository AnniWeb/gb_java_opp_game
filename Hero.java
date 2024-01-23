import java.util.ArrayList;

import Characters.CharacterInterface;

public class Hero {
    private CharacterInterface character; 
    private ArrayList<CharacterInterface> friends; 
    private ArrayList<CharacterInterface> enemies;

    public Hero(CharacterInterface character, ArrayList<CharacterInterface> friends, ArrayList<CharacterInterface> enemies) {
        this.character = character;
        this.friends = friends;
        this.enemies = enemies;
    }

    public void step() {
        if (character != null){
            character.step(friends, enemies);
        }
    }

    public Integer getInitiative() {
        return character == null ? 0 : character.getInitiative();
    }
}
