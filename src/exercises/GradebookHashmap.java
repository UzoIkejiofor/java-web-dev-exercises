package exercises;

//Make a program similar to GradebookHashMap that does the following:
//
//  It takes in student names and ID numbers (as integers) instead of names and grades.
//
//  The keys should be the IDs and the values should be the names.
//
//  Modify the roster printing code accordingly.


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class GradebookHashmap {
    public static void main (String[] args) {

        HashMap <Integer, String> roster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("ENTER student ID: ");

        do{
            System.out.println("Student Name: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.println("Student ID: ");
                Integer newStudentID = input.nextInt();
                roster.put(newStudentID, newStudent);

                input.nextLine();
            }
        } while (!newStudent.equals(""));
        input.close();
        System.out.println("\nClass roster: ");

        for (Map.Entry<Integer, String> student : roster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }
        System.out.println("Number of Students in roster: " + roster.size());

    }
}
