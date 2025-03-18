import java.util.Scanner;

public class Factorial{

    public static void main(String[]args){
        int number;
        long factorial = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        number = input.nextInt();
        input.close();

        if(number < 0 )
           System.out.println("Can't find the factorial of negative numbers");
        
        else{
            for(int counter = number; counter >=1; counter--){
                factorial = factorial * counter;
            }
            System.out.println("The factorial of "+number + " is "+factorial);
        }
    }
}