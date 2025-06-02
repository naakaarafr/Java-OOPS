import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                System.out.println("Not a prime number");
                break;
            }
            else{
                System.out.println("Prime number");
                break;
            }
        }
        
    }
}
