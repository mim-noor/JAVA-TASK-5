import java.util.Scanner;

public class BanglaSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month number (1-12): ");
        int month = scanner.nextInt();

        switch (month) {
            case 1, 2:
                System.out.println("Season: Sheet (Winter)");
                break;
            case 3, 4:
                System.out.println("Season: Basanta (Spring)");
                break;
            case 5, 6:
                System.out.println("Season: Grishmo (Summer)");
                break;
            case 7, 8:
                System.out.println("Season: Barsha (Rainy Season)");
                break;
            case 9, 10:
                System.out.println("Season: Sharat (Autumn)");
                break;
            case 11, 12:
                System.out.println("Season: Hemanto (Late Autumn)");
                break;
           
            default:
                System.out.println("Invalid month. Please enter a number between 1 and 12.");
        }

        scanner.close();
    }
}
