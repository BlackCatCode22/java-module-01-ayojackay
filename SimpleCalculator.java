import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Simple Calculator\nYou will be prompted to enter a number. You will be prompted to enter another number. Finally, you will be prompted to enter an operator.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number one: ");
        int numberOne = scanner.nextInt();
        System.out.println("Enter number two: ");
        int numberTwo = scanner.nextInt();
        scanner.close();
        int addition = numberOne + numberTwo;
        int subtraction = numberOne - numberTwo;
        int multiplication = numberOne * numberTwo;
        int division = numberOne / numberTwo;
        System.out.println("\nSee your chosen numbers sum with different operators.");
        System.out.println("\nAddition: " + addition + "\nSubtraction: " + subtraction + "\nMultiplication: " + multiplication + "\nDivision: " + division);

    }
}
