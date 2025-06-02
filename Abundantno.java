import java.util.Scanner;
public class Abundantno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum > number) {
            System.out.println("Abundant number");
        } else {
            System.out.println("Not an Abundant number");
        }
        scanner.close();
    }

}