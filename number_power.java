import java.util.Scanner;

public class number_power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the power: ");
        int power= sc.nextInt();
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= num;
        }
        System.out.println(result);
        sc.close();
    }
}
