import java.util.Scanner;
public class factors_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                System.out.println(i);
            }
            i++;
        }
        sc.close();
    }
}
