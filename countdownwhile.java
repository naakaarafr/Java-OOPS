import java.util.Scanner;
public class countdownwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        while (n >= 0) {
            System.out.println(n);
            n--;
        }
        sc.close();
    }
}
