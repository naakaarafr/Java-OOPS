import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        if (originalNumber == sum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
        scanner.close();
    }
}