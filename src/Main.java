import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TO DO:

        int numar = scanner.nextInt();
        scanner.nextLine();
        String mesaj = scanner.nextLine();

        for (int i = 1; i <= numar; i++) {
            System.out.println(i + ". " + mesaj);
        }
    }
}
