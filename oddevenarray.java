import java.util.Scanner;

public class oddevenarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number < 1) {
            System.out.println("Invalid input");
        } else {
            int oddCount = (number + 1) / 2;
            int evenCount = number / 2;

            int[] odd = new int[oddCount];
            int[] even = new int[evenCount];

            int oddIndex = 0, evenIndex = 0;

            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    even[evenIndex++] = i;
                } else {
                    odd[oddIndex++] = i;
                }
            }

            System.out.println("Odd Numbers:");
            for (int num : odd) {
                System.out.print(num + " ");
            }

            System.out.println("\nEven Numbers:");
            for (int num : even) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
