package java_two.grades;

import Logging.console;
import java_two.util.gui;

public class gradeStudent {
    private String studentsName;
    private int grades;

    public static void main(String[] args) {
        String result = gui.message("Whats the students name?");
        console.log(result);
    }
}
/*
Create an application for tracking student grades
It should have private properties for the student's name, and grades.
The grades property should be an ArrayList of integers.
The student class should have a constructor that sets name property,
and initializes the grades property as an empty ArrayList. The gradeStudent class should have the following methods:
// returns the student's name
public String getName();
// adds the given grade to the grades property
public void addGrade(int grade);
// returns the average of the Student grades
public double getGradeAverage();
Test your gradeStudent class by creating a StudentTest class, adding a main method and creating gradeStudent objects. Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.
Create a map for Student and GitHub usernames
Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named Student. It should have keys that are strings that represent github usernames, and values that are gradeStudent objects. Create at least 4 gradeStudent objects with at least 3 grades each, and add them to the map.
Be creative! Make up GitHub usernames and grades for your student objects.
Create the command line interface
Print the list of GitHub usernames out to the console, and ask the user which student they would like to see more information about. The user should enter a GitHub username (i.e. one of the keys in your map). If the given input does not match up with a key in your map, tell the user that no users with that username were found. If the given username does exist, display information about that student, including their name and their grades.
After the information is displayed, the application should ask the user if they want to continue, and keep running so long as the answer is yes.

Example output:
Welcome!
Here are the GitHub usernames of our Student:
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

Bonus Challenges
Display all the student's grades in addition to the grade average.
Allow the user to view all the grades for all the Student.
Modify your CLI to provide an option to view the overall class average.
Modify your CLI to provide an option to print a csv report of all the Student.

Example Output
name,github_username,average
Zach,zgulde,81.2
Ryan,ryanorsinger,88.3
Fernando,fmendozaro,90.4
...

Add an attendance property to your gradeStudent objects. It should be a HashMap. The keys should be strings representing the date, in the format "2017-10-02", and the values should be Strings that are one of:
"A": Absent
"P": Present
Add a method named recordAttendance(String date, String value) that adds records to the HashMap. This method should make sure value is an acceptable string.
Create an instance method on your gradeStudent class to calculate a student's attendance percentage -- (Total Days - Absences) / Total Days.
Add the attendance information to the output of your command line interface, this should require only a small change.
Create an instance method on gradeStudent that finds the specific days a student was absent. This method should return a List of Strings, where each string is the date of the absence.

 */
