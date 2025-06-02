import java.util.Scanner;
public class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary: ");
        int salary = sc.nextInt();
        System.out.println("Enter the year of service: ");
        int year = sc.nextInt();
        if (year > 5) {
            salary += 5*salary/100;
        }
        System.out.println("The new salary is: " + salary);
        sc.close();
    }
}
