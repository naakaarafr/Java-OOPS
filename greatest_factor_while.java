import java.util.Scanner;
public class greatest_factor_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int greatest_factor = 0;
        int i = 1;
        while (i < num) {
            if (num % i == 0) {
                greatest_factor = i;
            }
            i++;
        }
        System.out.println("The greatest factor of " + num + " is " + greatest_factor);
        sc.close();
    }
}

