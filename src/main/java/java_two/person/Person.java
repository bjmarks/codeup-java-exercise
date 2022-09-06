package java_two.person;

public class Person {
    private String firstName;
    private  String lastName;
    private String name;

    @Override
    public String toString() {
        return name;
    }
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person(String name) {this.name = name;}
    public String getName() {return name;}
    public void setName(String name){this.name = name;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void sayHello(){System.out.println("Hello " + fullName());}
    public String fullName() {return String.format("%s %s", firstName, lastName);}
}
