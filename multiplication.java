import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for (int i = 6; i < 10; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }
        sc.close();
    }
}