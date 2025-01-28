import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWhat is your favorite number?");

        int userFavoriteNumber = scanner.nextInt();
        System.out.println("\nYour favorite number is " + userFavoriteNumber);

        scanner.close();
    }
}
