package java_two.array;

import java.util.Random;

public class ServerNameGenerator {
    private static Random random = new Random();
    private static String [] adjective = {"blue", "red", "orange", "yellow", "green", "pink", "big", "long", "tiny"};
    private static String [] noun = {"house", "dog", "fish", "cat", "igloo", "rob", "cellophane", "iPhone", "S20+", "Killua"};

    public static void main(String[] args) {
        String randomAdjective = getRandomStringFromArray(adjective);
        String randomNoun = getRandomStringFromArray(noun);
        String randomNoun2 = getRandomStringFromArray(noun);
        System.out.println(randomAdjective + "-" + randomNoun + "-" + randomNoun2);
    }

    private static String getRandomStringFromArray(String[] strings) {
        int rando = random.nextInt(strings.length);
        return strings[rando];
    }
}