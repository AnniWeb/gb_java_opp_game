import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import Characters.CharacterInterface;
import Characters.Crossbowman;
import Characters.Monk;
import Characters.Peasant;
import Characters.RangedFighterType;
import Characters.Rogue;
import Characters.Sniper;
import Characters.Spearman;
import Characters.Warlock;
import Map.Cell;
import Map.GameMap;

public class Game {
    private static final int COUNT_CHARACTERS = 10;
    private static GameMap map;

    public static void main(String[] args) {
        map = new GameMap(COUNT_CHARACTERS);
        ArrayList<CharacterInterface> team1 = genereateTeam(true);
        ArrayList<CharacterInterface> team2 = genereateTeam(false);

        System.out.println("Игра началась");
        System.out.println("Команда 1:");
        team1.forEach(person -> System.out.println(person));
        System.out.println("");
        System.out.println("Команда 2:");
        team2.forEach(person -> System.out.println(person));

        System.out.println("Позиции:");
        map.printMap();

        System.out.println("Цели для стрелков:");
        printRangedTarget(team1, team2);
        printRangedTarget(team2, team1);

        System.out.println("Игра закончилась");
    }

    private static void printRangedTarget(ArrayList<CharacterInterface> army, ArrayList<CharacterInterface> targets)
    {
        for (CharacterInterface hero : army) {
            if (hero instanceof RangedFighterType) {
                CharacterInterface enemy = ((RangedFighterType)hero).findNearestEnemy(targets);
                if (enemy == null){
                    System.out.println(hero + ": не видит врагов");
                } else {
                    System.out.println("Ближайшая цель " + hero + " -> " + enemy);
                }
            }
        }
    }

    private static ArrayList<CharacterInterface> genereateTeam(boolean sideLeft)
    {
        int start = sideLeft ? 1 : 4;
        ArrayList<CharacterInterface> team = new ArrayList<CharacterInterface>();
        Random random = new Random();

        for (int i = 0; i < COUNT_CHARACTERS; i++) {
            int typeCharacter = random.nextInt(4) + start;
            String name = genereateCharacterName();
            Cell pos = new Cell(i, sideLeft ? 0 : (map.getSize() - 1));
            CharacterInterface newHero;

            switch (typeCharacter) {
                case 1:
                    newHero = new Crossbowman(pos, name);
                    break;
                case 2:
                    newHero = new Spearman(pos, name);
                    break;
                case 3:
                    newHero = new Warlock(pos, name);
                    break;
                case 4:
                    newHero = new Peasant(pos, name);
                    break;
                case 5:
                    newHero = new Sniper(pos, name);
                    break;
                case 6:
                    newHero = new Rogue(pos, name);
                    break;
                case 7:
                    newHero = new Monk(pos, name);
                    break;
                default:
                    newHero = null;
                    break;
            }
            if (newHero != null) {
                team.add(newHero);
                map.placeCharacter(newHero);
            }
        }

        return team;
    }

    private static String genereateCharacterName()
    {
        return CharacterNamesEnum.values()[new Random().nextInt(CharacterNamesEnum.values().length-1)].name();
    }
}