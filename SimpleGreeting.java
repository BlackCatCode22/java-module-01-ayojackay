import java.util.Scanner;

public class SimpleGreeting {
    public static void main(String[] args) {
        System.out.println("Greetings!");

        Scanner scanner = new Scanner(System.in);

        String username;
        System.out.println("\nPlease enter your username: ");
        username = scanner.nextLine();

        System.out.println("\nHello " + username + "! How are you today?");
    }
}
