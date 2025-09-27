public class Ex14 {

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i == 14) {
                System.out.println(i);
                break;
            }
            System.out.println(i);
        }

        System.out.println("=== Continuăm numărătoarea ===");

        for (int i = 14; i <= 20; i++) {
            if (i == 14) {
                continue;
            }
            System.out.println(i);
        }

    }

}

