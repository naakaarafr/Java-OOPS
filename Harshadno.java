import java.util.Scanner;
public class Harshadno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        if (originalNumber % sum == 0) {
            System.out.println("Harshad number");
        } else {
            System.out.println("Not a Harshad number");
        }
        scanner.close();
    }
}