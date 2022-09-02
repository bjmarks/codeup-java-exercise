package java_two.collections.grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
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
        students.put("bjmarks13",ben);
        students.put("Prohunter", tim);
        students.put("melcortinas", mel);
        students.put("jacortinas", joe);
        students.put("bobross", bob);
        System.out.println(students);
    }
}
/*
and ask the user which student they would like to see more information about.
The user should enter a GitHub username (i.e. one of the keys in your map).
If the given input does not match up with a key in your map,
tell the user that no users with that username were found.
If the given username does exist, display information about that student,
including their name and their grades.
After the information is displayed, the application should ask the user
if they want to continue, and keep running so long as the answer is yes.

        Example output:
        Welcome!
        Here are the GitHub usernames of our students:
        |zgulde| |ryanorsinger| |jreich5| |fmendozaro| |MontealegreLuis|
        What student would you like to see more information on?
        > pizza
        Sorry, no student found with the GitHub username of "pizza".
        Would you like to see another student?
        > y
        What student would you like to see more information on?
        > zgulde
        Name: Zach - GitHub Username: zgulde
        Current Average: 87.4
        Would you like to see another student?
        > no
        Goodbye, and have a wonderful day!
*/






/*
        Bonus Challenges
        Display all the student's grades in addition to the grade average.
        Allow the user to view all the grades for all the students.

        name,github_username,average
        Zach,zgulde,81.2
        Ryan,ryanorsinger,88.3
        Fernando,fmendozaro,90.4
        Add an attendance property to your Student objects.
        It should be a HashMap.
        The keys should be strings representing the date,
        in the format "2017-10-02",
        and the values should be Strings that are one of:
        "A": Absent
        "P": Present
        Add a method named recordAttendance(String date, String value) that adds records to the HashMap. This method should make sure value is an acceptable string.
        Create an instance method on your Student class to calculate a student's attendance percentage -- (Total Days - Absences) / Total Days.
        Add the attendance information to the output of your command line interface, this should require only a small change.
        Create an instance method on Student that finds the specific days a student was absent. This method should return a List of Strings, where each string is the date of the absence.
 */