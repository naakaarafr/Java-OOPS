import java.util.Scanner;
public class greatest_factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int i = 1;
        int greatest_factor = 0;
        for (i = 1; i < num; i++) {
            if (num % i == 0) {
                greatest_factor = i;
            }
        }
        System.out.println("The greatest factor of " + num + " is " + greatest_factor);
        sc.close();
    }
}
