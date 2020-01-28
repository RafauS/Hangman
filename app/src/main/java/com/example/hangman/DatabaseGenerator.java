package com.example.hangman;

public class DatabaseGenerator {

    public static final String INSERT_SPORT = "INSERT INTO " + DatabaseHelper.TABLE_NAME + " (SPORT) VALUES ('aerobics'),('archer'),('arena'),('arrow'),('athlete'),('axel'),('badminton'),('ball'),('baseball'),('basketball'),('baton'),('bicycle'),('bowling'),('bowler'),('cricket'),('fitness'),('football'),('golf'),('gymnastics'),('handball'),('karate'),('rugby'),('sculling'),('weightlifting'),('windsurfing');";

    public static final String INSERT_FAMILY = "INSERT INTO " + DatabaseHelper.TABLE_NAME + " (FAMILY) VALUES ('aunt'),('brother'),('boyfriend'),('bride'),('cousin'),('brother'),('dad'),('daughter'),('father'),('friend'),('girlfriend'),('grandfather'),('grandmother'),('husband'),('mother'),('nephew'),('niece'),('parent'),('sister'),('son'),('twin'),('uncle'),('wife'),('child'),('couple');";

    public static final String INSERT_ANIMAL = "INSERT INTO " + DatabaseHelper.TABLE_NAME + " (ANIMAL) VALUES ('frog'),('newt'),('spider'),('scorpion'),('crow'),('pigeon'),('duck'),('eagle'),('finch'),('flamingo'),('ostrich'),('owl'),('parrot'),('peacock'),('pelican'),('piranha'),('sparrow'),('swallow'),('swift'),('turkey'),('crab'),('shark'),('ant'),('dolphin'),('fox'),('horse'),('mouse'),('puma'),('rhinoceros'),('tiger'),('snake'),('sidewinder');";

    public static final String INSERT_FOOD = "INSERT INTO " + DatabaseHelper.TABLE_NAME + " (FOOD) VALUES ('lamb'),('chicken'),('turkey'),('goose'),('duck'),('rabbit'),('hare'),('partridge'),('pheasant'),('prawns'),('shrimps'),('lobster'),('scallops'),('mussels'),('crab'),('vegetables'),('fruit'),('seafood'),('fish'),('meat'),('sugar'),('grains'),('protein');";

    public static final String INSERT_SCHOOL = "INSERT INTO " + DatabaseHelper.TABLE_NAME + " (SCHOOL) VALUES ('answer'),('arithmetic'),('assignment'),('backpack'),('blackboard'),('calculator'),('classroom'),('compass'),('desk'),('exam'),('experiment'),('highlighter'),('history'),('language'),('lesson'),('map'),('mathematics'),('memorize'),('notebook'),('paper'),('pencil'),('question'),('reading'),('science'),('teacher'),('thesaurus'),('vocabulary'),('watercolors'),('whiteboard'),('writing'),('yardstick');";
}

