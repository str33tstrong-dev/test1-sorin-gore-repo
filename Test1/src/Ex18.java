import java.util.Scanner;
import java.util.Arrays;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu numărul de elemente din array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Introdu elementele array-ului:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elementul " + i + ": ");
            array[i] = scanner.nextInt();
        }

        int minim = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minim) {
                minim = array[i];
            }
        }

        System.out.println("Array-ul: " + Arrays.toString(array));
        System.out.println("Elementul cu valoarea cea mai mica: " + minim);

    }
}
