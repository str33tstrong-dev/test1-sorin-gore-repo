import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        if (primNumber > secondNumber)
            System.out.println("Primul numar este mai mare de cât al 2-le.");
        else System.out.println("Al doile număr este mai mare de cât primul.");
    }

}
