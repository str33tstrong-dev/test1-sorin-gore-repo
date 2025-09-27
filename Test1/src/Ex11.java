import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Scrie un text: ");
        String text = scanner.nextLine();

        int lungime = text.length();       // numărul total de caractere
        int indexMaxim = lungime - 1;      // ultima poziție validă

        System.out.println("Cantitatea de caractere: " + lungime);
        System.out.println("Indexul maxim: " + indexMaxim);

    }
}

