import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

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
        int step = 0;
        map = new GameMap(COUNT_CHARACTERS);
        ArrayList<CharacterInterface> team1 = genereateTeam(true);
        ArrayList<CharacterInterface> team2 = genereateTeam(false);

        ArrayList<Hero> heros = new ArrayList<Hero>();
        team1.forEach(item -> heros.add(new Hero(item, map, team1, team2)));
        team2.forEach(item -> heros.add(new Hero(item, map, team2, team1)));

        System.out.println("Игра началась");
        // System.out.println("Команда 1:");
        // team1.forEach(person -> System.out.println(person));
        // System.out.println("");
        // System.out.println("Команда 2:");
        // team2.forEach(person -> System.out.println(person));

        System.out.println("Позиции:");
        map.printMap();

        System.out.println("");
        
        System.out.println("Шаг " + ++step);
        heros.sort((hero1, hero2) -> hero2.getInitiative() - hero1.getInitiative());
        heros.forEach(hero -> hero.step());

        System.out.println("");
        System.out.println("Позиции:");
        map.printMap();

        System.out.println("Игра закончилась");
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