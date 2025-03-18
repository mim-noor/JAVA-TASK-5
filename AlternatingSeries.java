import java.util.Scanner;

public class AlternatingSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            
            if (i % 2 == 0) {
                sum -= i;
                System.out.print("- " + i + " ");
            } else {
                sum += i;
                System.out.print((i == 1) ? i : "+ " + i + " ");
            }
        }

        System.out.println("\nSum of the series up to " + n + " terms = " + sum);

        scanner.close();
    }
}

