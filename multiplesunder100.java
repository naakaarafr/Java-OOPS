import java.util.Scanner;

public class multiplesunder100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();
        
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input! Please enter a number between 1 and 99.");
        } else {
            System.out.println("Multiples of " + number + " below 100:");
            
            for (int i = 100; i > 0; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
        
        scanner.close();
    }
}
