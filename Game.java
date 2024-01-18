import java.util.ArrayList;
import java.util.Random;

import Characters.CharacterInterface;
import Characters.Crossbowman;
import Characters.Monk;
import Characters.Peasant;
import Characters.Rogue;
import Characters.Sniper;
import Characters.Spearman;
import Characters.Warlock;

public class Game {
    private static final int COUNT_CHARACTERS = 10;

    public static void main(String[] args) {
        ArrayList<CharacterInterface> team1 = genereateTeam(1);
        ArrayList<CharacterInterface> team2 = genereateTeam(4);

        System.out.println("Игра началась");
        System.out.println("Команда 1:");
        team1.forEach(person -> System.out.println(person));
        System.out.println("");
        System.out.println("Команда 2:");
        team2.forEach(person -> System.out.println(person));
        System.out.println("Игра закончилась");
    }

    private static ArrayList<CharacterInterface> genereateTeam(int start)
    {
        ArrayList<CharacterInterface> team = new ArrayList<CharacterInterface>();
        Random random = new Random();

        for (int i = 0; i < COUNT_CHARACTERS; i++) {
            int typeCharacter = random.nextInt(4) + start;
            String name = genereateCharacterName();

            switch (typeCharacter) {
                case 1:
                    team.add(new Crossbowman(name));
                    break;
                case 2:
                    team.add(new Spearman(name));
                    break;
                case 3:
                    team.add(new Warlock(name));
                    break;
                case 4:
                    team.add(new Peasant(name));
                    break;
                case 5:
                    team.add(new Sniper(name));
                    break;
                case 6:
                    team.add(new Rogue(name));
                    break;
                case 7:
                    team.add(new Monk(name));
                    break;
                default:
                    break;
            }
        }

        return team;
    }

    private static String genereateCharacterName()
    {
        return CharacterNamesEnum.values()[new Random().nextInt(CharacterNamesEnum.values().length-1)].name();
    }
}