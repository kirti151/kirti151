
import java.util.*;

public class Grade {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        int marks = s.nextInt();
        char grade = ' ';
        if (marks >= 100) {
            grade = 'A';
        } else if (marks >= 95) {
            grade = 'B';
        } else if (marks >= 85) {
            grade = 'C';
        } else if (marks >= 55) {
            grade = 'D';
        } else {
            grade = 'E';

        }
        System.out.print("Grade is: " + grade);

    }
}
