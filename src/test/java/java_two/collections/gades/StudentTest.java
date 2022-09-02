package java_two.collections.gades;

import java_two.collections.grades.Student;
import org.junit.Test;

public class StudentTest {
    public static void main(String[] args) {
        Student ben = new Student("benjamin");
        Student tim = new Student("timothy");
        Student mel = new Student("melissa");
        Student joe = new Student("joseph");
        Student bob = new Student("bob");
        ben.addGrade(100);
        ben.addGrade(95);
        ben.addGrade(98);
        ben.addGrade(99);
        tim.addGrade(100);
        tim.addGrade(58);
        tim.addGrade(89);
        tim.addGrade(70);
        mel.addGrade(100);
        mel.addGrade(85);
        mel.addGrade(69);
        mel.addGrade(94);
        joe.addGrade(100);
        joe.addGrade(86);
        joe.addGrade(76);
        joe.addGrade(90);
        bob.addGrade(100);
        bob.addGrade(92);
        bob.addGrade(91);
        bob.addGrade(87);
        System.out.println(ben.getGradeAverage());
        System.out.println(tim.getGradeAverage());
        System.out.println(mel.getGradeAverage());
        System.out.println(joe.getGradeAverage());
        System.out.println(bob.getGradeAverage());

    }
}