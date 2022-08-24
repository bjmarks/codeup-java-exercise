package java_two.array;

import java_two.person.Person;
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        Person[] waifus = {new Person("Genos"), new Person("jabami"), new Person("goku")};
        //        Person [] waifus = new Person[3];
//        waifus[0] = new Person("Alysha");
//        waifus[1] = new Person("Benjamin");
//        waifus[2] = new Person("Carlos");
        System.out.println(Arrays.toString(waifus));

        for (Person waifu : waifus){
            System.out.println(waifu);
        }
        waifus = addPerson(waifus, new Person("sagari"));
        for (Person person : waifus){
            System.out.println(person);
        }
    }
    private static Person [] addPerson(Person[] waifus, Person newPerson) {
        Person [] newAray = Arrays.copyOf(waifus, waifus.length + 1);
        newAray[newAray.length - 1] = newPerson;
        return newAray;
    }

}
