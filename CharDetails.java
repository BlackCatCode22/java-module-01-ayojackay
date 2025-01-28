import java.util.Scanner;

public class CharDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single character: ");
        String input = scanner.next();
        char ch = input.charAt(0);
        int unicode = input.codePointAt(0);
        if (input.matches("[0-9.]+")) {
            System.out.println("\nYour input is of type Number and the Unicode value is " + unicode);
        } else {
            System.out.println("\nYour input "+ ch + " is of type String and the Unicode value is " + unicode);
        }
        scanner.close();
    }
}
