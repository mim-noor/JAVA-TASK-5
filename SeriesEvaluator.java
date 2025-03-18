import java.util.Scanner;

public class SeriesEvaluator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int sum = 0;
        int currentOdd = 1; 
      
        for (int i = 1; i <= n; i++) {
            sum += currentOdd * currentOdd;  
            currentOdd += 2;  
        }

        System.out.println("The sum of the series is: " + sum);

        scanner.close();
    }
}