package java_two.person;

public class PersonTest {
    public static void main(String[] args) {
//        Person person1 = new Person("Benjamin");
//        Person person2 = new Person("Michael");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
        Person person1 = new Person("John");
        Person person2 = new Person("Jerry", "Signfeild");
        System.out.println(person1.getName());
        System.out.println(person2.fullName());
        person2.setFirstName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.fullName());
        person2.sayHello();
    }
}
