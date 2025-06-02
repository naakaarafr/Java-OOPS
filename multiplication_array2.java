import java.util.Scanner;

public class multiplication_array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = sc.nextInt();

        int[] multiplication = new int[4];

        for (int i = 0; i < 4; i++) {
            multiplication[i] = input * (i + 6);
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(input + " * " + (i + 6) + " = " + multiplication[i]);
        }

        sc.close();
    }
}
