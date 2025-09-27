import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2==0)
            System.out.println("Numarul este par");
        else System.out.println("Numarul este impar");

    }

}
