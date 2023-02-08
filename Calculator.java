import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner scanner = new Scanner(System.in);
        Double number1 = scanner.nextDouble();
        Double number2 = scanner.nextDouble();
        scanner.nextLine();

        Double result = 0.0;
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

        if(number2 == 0 && response.equalsIgnoreCase("Division")){
            System.out.println("Error: Divide by Zero");
        } else {
            System.out.println("Result = " + result);
        }
 
        
        scanner.close();
         

    }

}