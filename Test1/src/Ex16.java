import java.util.Arrays;

public class Ex16 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        int indicePrimul = 0;

        int indiceUltimul = array.length - 1;

        int lungime = array.length;

        System.out.println("Array-ul: " + Arrays.toString(array));
        System.out.println("Indicele primului element: " + indicePrimul);
        System.out.println("Indicele ultimului element: " + indiceUltimul);
        System.out.println("Lungimea array-ului: " + lungime);
    }
}
