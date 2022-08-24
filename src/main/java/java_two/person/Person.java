package java_two.person;

public class Person {
    private String name;

    @Override
    public String toString() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }
    public String getName() {return name;}
    public void setName(String name){this.name = name;}
    public void sayHello(){
        System.out.println("Hello" + name);
    }
    public static void main(String[] args) {
//        Person person1 = new Person("Benjamin");
//        Person person2 = new Person("Michael");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}
