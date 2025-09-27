import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu vârsta: ");
        int varsta = scanner.nextInt();

        if (varsta <= 0 || varsta > 102) {
            System.out.println("Vârsta introdusă nu este validă");
        } else {
            if (varsta <= 12) {
                System.out.println("Ești copil.");
            } else if (varsta <= 17) {
                System.out.println("Ești adolescent.");
            } else {
                System.out.println("Ești adult.");
            }
        }

    }
}
