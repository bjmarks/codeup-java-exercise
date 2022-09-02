package java_two.collections.grades;

import java.util.ArrayList;

public class Student {
    private String Name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String Name) {this.Name = Name;}
    public String getName() {return Name;}
    public void setName(String name) {Name = name;}
    public ArrayList<Integer> getGrades() {return grades;}
    public void addGrade(int grade) {grades.add(grade);}
    public double getGradeAverage() {
        double avg;
        double sum = 0;
        for (int grade: grades) {sum += grade;}
        avg = sum/grades.size();
        return avg;}

    @Override
    public String toString() {
        return Name + ", grades = " + grades;
    }
}