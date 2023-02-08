import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(
                "Hey, do you want to perform a subtraction or addition on these numbers.Type in subtraction or addition ");
        String response = scanner.nextLine();
        scanner.nextLine();

        if(response.equalsIgnoreCase("Addition")){
            int result = number1 + number2;
            
        } else {
            int result = number1 - number2;
            System.out.println("Result = " + result);
        }
        

        

    }

}