import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.nextLine();

        int result = 0;
        System.out.println(
                "Hey, do you want to perform a subtraction,addition, multiplication or division on these numbers.Type in your choice.");
        String response = scanner.nextLine();

        switch(response.toUpperCase()){
            case "SUBTRACTION" : 
            result = number1 - number2; 
            break;
            case "ADDITION" : 
            result = number1 + number2;
            break;
            case "DIVISION" : 
            result = number1 / number2;
            break;
            case "MULTIPLICATION" : 
            result = number1 * number2;
            break;     
        }

        System.out.println("Result = " + result);
         

    }

}