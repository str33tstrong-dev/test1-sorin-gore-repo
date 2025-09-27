import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Apasă R, G sau V: ");
        String input = scanner.nextLine().toUpperCase();

        switch (input) {
            case "R":
                System.out.println("Roșu");
                break;
            case "G":
                System.out.println("Galben");
                break;
            case "V":
                System.out.println("Verde");
                break;
            default:
                System.out.println("Litera introdusă nu este validă!");
        }

    }
}
