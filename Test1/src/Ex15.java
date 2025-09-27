import java.util.Arrays;

public class Ex15 {

        public static void main(String[] args) {

            byte[] array = {1, 2, 3, 4, 5, 6, 7, 8};

            System.out.println("Array inițial: " + Arrays.toString(array));

            array[4] = 99;

            System.out.println("Array modificat: " + Arrays.toString(array));
        }
    }

