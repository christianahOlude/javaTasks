package Arrays;

import java.util.Scanner;

public class LagbajaSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        println("*** WELCOME TO LAGBAJA SCHOOLS *** ");
        println("Enter the number of students : ");
        int numberOfStudents = sc.nextInt();

        System.out.println("Enter the number of subjects : ");
        int numberOfSubjects = sc.nextInt();
        println("Saving >>>>>>>>>>>>>>>>>");
        println("Saved successfully");
//        println();
        int score = 0;
        int i ;
        int j = 1;

        for (i = 1; i <= numberOfStudents; i++) {
            for (j = 1; j <= numberOfSubjects; j++) {
                println("Entering score for student " + i );
                println("Enter score for subject " + j);
                score = sc.nextInt();
                println("Saving >>>>>>>>>>>>>>>>>");
                println("Saved successfully");
            }
        }
//            if(score < 0 || score > 100) {
//                System.out.println("Invalid score");
//            }

        for (int symbol = 0; symbol < 50; symbol++) {
            System.out.print("=");
            System.out.print("");
        }
        println("STUDENT");
        for(int student = 1; student <= numberOfStudents; student++) {
            println("STUDENT " + student);
        }
//        System.out.println("STUDENTS" + "SUB" + j + "TOT" + "AVE" + "POS");
//        for(int i = 1; i <= numberOfStudents; i++) {}
    }
    public static void println(String print) {
        System.out.println(print);
    }
}
