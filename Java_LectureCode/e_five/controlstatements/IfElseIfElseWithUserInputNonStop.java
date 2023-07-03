package e_five.controlstatements;

import java.util.Scanner;

public class IfElseIfElseWithUserInputNonStop {
    public static void main(String[] args){
        // decide the grade based on marks
        do {
            System.out.println("Please enter total marks");
            Scanner scanner = new Scanner(System.in);
            double totalMarks = scanner.nextDouble();

            if (totalMarks <= 100 && totalMarks >= 90) {
                System.out.println("Your grade is A");
            } else if (totalMarks <= 89 && totalMarks >= 80) {
                System.out.println("Your grade is B");
            } else {
                System.out.println("Your grade is C");
            }
        }while(true);
    }
}
