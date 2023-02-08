import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = number1 + number2;

        System.out.println("Result = " + result);


    }

}