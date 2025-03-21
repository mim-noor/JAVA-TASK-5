import java.util.Arrays;
import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Numbers in ascending order: " + Arrays.toString(numbers));

        scanner.close();
    }
}
