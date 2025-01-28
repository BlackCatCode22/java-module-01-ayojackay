import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount for principal: ");
        double principal = input.nextDouble();
        System.out.println("Enter an amount for time: ");
        double time = input.nextDouble();
        System.out.println("Enter an amount for rate of interest: ");
        double rate = input.nextDouble();
        double interest = principal * time * rate / 100;
        System.out.println("Interest Rate: " + interest);
    }
}
