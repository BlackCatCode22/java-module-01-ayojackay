import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a noun: ");
        String noun = scanner.nextLine();
        System.out.println("Please give me an adjective: ");
        String adjective = scanner.nextLine();
        System.out.println("Please give me a verb: ");
        String verb = scanner.nextLine();
        scanner.close();
        System.out.println("\nThe " + noun + " looked " + adjective + " when they " + verb + "!");
    }
}
