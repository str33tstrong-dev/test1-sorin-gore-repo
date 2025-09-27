import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu ora (0 - 23): ");
        int ora = scanner.nextInt();

        if (ora >= 6 && ora <= 11) {
            System.out.println("Este dimineața.");
        } else if (ora >= 12 && ora <= 16) {
            System.out.println("Este ziua.");
        } else if (ora >= 17 && ora <= 21) {
            System.out.println("Este seara.");
        } else if ((ora >= 22 && ora <= 23) || (ora >= 0 && ora <= 5)) {
            System.out.println("Este noaptea.");
        } else {
            System.out.println("Nu exista asa ora.");
        }

    }

}
