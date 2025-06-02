import java.util.Scanner;

public class factorsarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if (a < 1) {
            System.out.println("Invalid input");
        } else {
            int[] factors = new int[a]; // Max possible size
            int count = 0; // To track actual number of factors

            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    factors[count++] = i; // Store the factor and increment count
                }
            }

            // Print the stored factors
            System.out.print("Factors of " + a + ": ");
            for (int i = 0; i < count; i++) {
                System.out.print(factors[i] + " ");
            }
        }

        sc.close();
    }
}
