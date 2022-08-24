package java_two.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testIfStudentCanBeCreated(){
        Student ben = new Student(1L, "ben");
        Student nullStudent = null;
        assertNotNull(ben);
        assertNull(nullStudent);
    }

    @Test
    public void testIfFieldsAreSet(){
        Student ben = new Student(1L, "ben");
        assertEquals(1L, ben.getId());
        assertEquals("ben", ben.getName());

        Student rosie = new Student(40L, "Rosie");
        assertEquals(40L, rosie.getId());
        assertEquals("Rosie", rosie.getName());
    }

    @Test
    public void testIfAddGradeWorks(){
        Student ben = new Student(1L, "ben");
        assertEquals(0, ben.getGrades().size());
        ben.addGrade(90);
        assertEquals(1, ben.getGrades().size());
        ben.addGrade(100);
        assertEquals(2, ben.getGrades().size());
    }

    @Test
    public void testIfGetGradesWorks(){
        Student ben = new Student(1L, "ben");
        ben.addGrade(98);
        ben.addGrade(75);
        assertSame(98, ben.getGrades().get(0));
        assertSame(75, ben.getGrades().get(1));
    }

    @Test
    public void testIfGetAVGWorks(){
        Student ben = new Student(1L, "ben");
        ben.addGrade(90);
        ben.addGrade(70);
        assertEquals(80, ben.getGradeAverage(), 0);
        ben.addGrade(50);
        assertEquals(70, ben.getGradeAverage(), 0);
    }

    @Test
    public void testIfUpdateGradeWorks(){
        Student ben = new Student(1L, "ben");
        ben.addGrade(100);
        ben.addGrade(87);
        ben.addGrade(98);
        ben.updateGrade(87, 98);
        assertSame(98,ben.getGrades().get(1));
    }
    @Test
    public void testIfDeleteWorks(){
        Student ben = new Student(1L,"ben");
        ben.addGrade(99);
        ben.addGrade(87);
        ben.addGrade(100);
        ben.addGrade(100);
        ben.addGrade(100);
        ben.deleteGrade(100);
        assertEquals(96.5, ben.getGradeAverage(), 0);
    }
}