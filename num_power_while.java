import java.util.Scanner;

public class num_power_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the power: ");
        int power = sc.nextInt();
        int result = 1;
        int counter = 0;
        while ( counter == power) {
            result *= num;
            counter++;
        }
        System.out.println(result);
        sc.close();
    }
}