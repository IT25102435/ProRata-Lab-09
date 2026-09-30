import java.util.Scanner;

public class IT25102435Lab9Q4 {

    public static double calcFinalMark(double assignment, double exam) {

        double finalMark;

        finalMark = (assignment * 0.30) + (exam * 0.70);

        return finalMark;
    }

    public static char findGrades(double finalMark) {

        char grade;

        if (finalMark >= 75) {
            grade = 'A';
        }
        else if (finalMark >= 65) {
            grade = 'B';
        }
        else if (finalMark >= 55) {
            grade = 'C';
        }
        else if (finalMark >= 45) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }

        return grade;
    }

    public static void printDetails(String name, double finalMark, char grade) {

        System.out.println("Name       : " + name);
        System.out.println("Final Mark : " + finalMark);
        System.out.println("Grade      : " + grade);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        double assignment;
        double exam;
        double finalMark;
        char grade;

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Enter Name: ");
            name = input.next();

            System.out.print("Enter Assignment Mark: ");
            assignment = input.nextDouble();

            System.out.print("Enter Exam Mark: ");
            exam = input.nextDouble();

            finalMark = calcFinalMark(assignment, exam);

            grade = findGrades(finalMark);

            printDetails(name, finalMark, grade);
        }
    }
}