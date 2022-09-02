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

//    protected String firstName;
//    protected String lastName;
//
//    public Person(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    public String fullName() {
//        return String.format("%s %s", firstName, lastName);
//    }
}
