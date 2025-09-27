import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println(primNumber+secondNumber);
        System.out.println(primNumber-secondNumber);
        System.out.println(primNumber*secondNumber);
        System.out.println(primNumber%secondNumber);

    }

}
