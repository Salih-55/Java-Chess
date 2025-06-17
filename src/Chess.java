import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter letter (a-h): ");
        String letter = kb.next().toLowerCase();

        System.out.print("Enter number (1-8): ");
        int number = kb.nextInt();

        if (!letter.matches("[a-h]") || number < 1 || number > 8) {
            System.out.println("Invalid input!");
            kb.close();
            return;
        }

        int letterValue = letter.charAt(0) - 'a' + 1;

        if ((letterValue + number) % 2 == 0) {
            System.out.println("black");
        } else {
            System.out.println("white");
        }

        kb.close();
    }
}
