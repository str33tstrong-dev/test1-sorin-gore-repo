import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdu numărul lunii (1-12): ");
        int luna = scanner.nextInt();

        String anotimp;

        switch (luna) {
            case 12: case 1: case 2:
                anotimp = "Iarna";
                break;
            case 3: case 4: case 5:
                anotimp = "Primăvara";
                break;
            case 6: case 7: case 8:
                anotimp = "Vara";
                break;
            case 9: case 10: case 11:
                anotimp = "Toamna";
                break;
            default:
                anotimp = "Trebuie să fie între 1 și 12.";
        }

        System.out.println("Anotimpul este: " + anotimp);

    }

}
