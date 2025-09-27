import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un text: ");
        String text = scanner.next();
        System.out.println("Textul modificat este:" + text.toUpperCase());

    }

}
