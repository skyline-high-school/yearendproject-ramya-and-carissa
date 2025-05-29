package Product;

import java.util.Scanner;
public class FinalProject {
    public static void main(String[] args) {
        // define scanner
        Scanner sc = new Scanner(System.in);

        // ask how many classes they're taking
        System.out.println("How many classes do you have? ");
        int numClasses = sc.nextInt();
        // USE TO FIX SCANNER
        sc.nextLine();
        System.out.println();

        // create array for class names and class grades and credit amounts
        String[] classes = new String[numClasses];
        String[] letterGrades = new String[numClasses];
        double[] credits = new double[numClasses];
        double[] grades = new double[numClasses];

        // print program instructions
        System.out.println("Next, you will enter your class name, credit amount, and corresponding letter grade. \nThe computer will continue to prompt you until you've entered your entire schedule. \nPlease enter letter grades in the form \"A\" \"A-\" or \"A+\". \nPlease enter credit amounts in decimal form (ex: 1.0 or 0.5).");
        System.out.println();

        // enter class names and grades
        for (int i = 0; i<numClasses;i++) {
            System.out.println("Information for Class #" + (i + 1) + ": ");
            System.out.println("-------------------------");
            System.out.println("Enter the class name: ");
            String className = sc.nextLine();

            System.out.println("Enter the credit amount: ");
            double creditAmount = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter the letter grade: ");
            String gradeReceived = sc.nextLine();

            //System.out.println(className + " : " + i);
            classes[i] = className;
            credits[i] = creditAmount;
            letterGrades[i] = gradeReceived;
        }

        // convert letter grades to GPA quantities
        for (int i = 0; i<letterGrades.length;i++) {
            if (letterGrades[i].equals("A") || letterGrades[i].equals("A+")) {
                grades[i] = 4.0;
            } else if (letterGrades[i].equals("A-")) {
                grades[i] = 3.7;
            } else if (letterGrades[i].equals("B+")) {
                grades[i] = 3.3;
            } else if (letterGrades[i].equals("B")) {
                grades[i] = 3.0;
            } else if (letterGrades[i].equals("B-")) {
                grades[i] = 2.7;
            } else if (letterGrades[i].equals("C+")) {
                grades[i] = 2.3;
            } else if (letterGrades[i].equals("C")) {
                grades[i] = 2.0;
            } else if (letterGrades[i].equals("C-")) {
                grades[i] = 1.7;
            } else if (letterGrades[i].equals("D+")) {
                grades[i] = 1.3;
            } else if (letterGrades[i].equals("D")) {
                grades[i] = 1.0;
            } else if (letterGrades[i].equals("D-")) {
                grades[i] = 0.7;
            } else if (letterGrades[i].equals("F")) {
                grades[i] = 0.0;
            }
        }

        // calculate gpa
        // (gpa in course * credit amount) for each course, all added together, then / # courses
        double gpa = 0.0;
        for (int i = 0; i<numClasses;i++) {
            gpa += grades[i] * credits[i];
        }

        gpa /= numClasses;

        // print gpa
        for (int i = 0; i <numClasses; i++) {
            System.out.println(classes[i] + ": \t" + letterGrades[i]);
            //System.out.println();
        }
        System.out.println("Your GPA for the inputted information is: " + gpa);
    }
}

