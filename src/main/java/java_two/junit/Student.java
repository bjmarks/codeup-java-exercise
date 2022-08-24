package java_two.junit;

import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public long getId(){return this.id;}
    public String getName(){return this.name;}
    public void addGrade(int grade){grades.add(grade);}
    public ArrayList<Integer> getGrades(){return this.grades;}
    public double getGradeAverage() {
        double total = 0.0;
        for (double grade : this.grades){
            total = total + grade;
        }
        return total / getGrades().size();
    }
    public void updateGrade(int changeGrade, int newGrade){
        for (int i = 0; i < getGrades().size(); i++) {
            if (changeGrade == grades.get(i)) {
                grades.set(i, newGrade);
            }
        }
    }
    public void deleteGrade(int delete) {
        for (int i = 0; i < getGrades().size(); i++) {
            if (delete == getGrades().get(i)) {
                grades.remove(i);
                break;
            }
        }
    }
}
