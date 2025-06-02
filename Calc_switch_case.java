import java.util.Scanner;
public class Calc_switch_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Enter a number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter a operator: ");
        String operator = scanner.next();
        switch (operator) {
            case "+":
                System.out.println(number + number2);
                break;
            case "-":
                System.out.println(number - number2);
                break;
            case "*":
                System.out.println(number * number2);
                break;
            case "/":
                System.out.println(number / number2);
                break;
        }
        scanner.close();
    }
}