import java.util.Scanner;
public class marks2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the physics marks: ");
        int physics = scanner.nextInt();
        System.out.print("Enter the chemistry marks: ");
        int chemistry = scanner.nextInt();
        System.out.print("Enter the maths marks: ");
        int maths = scanner.nextInt();
        
        int total = physics + chemistry + maths;
        double percentage = (total / 3.0);
        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percentage+"%");
        double average = total / 3.0;
        System.out.println("Average: " + average);
        if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70 && percentage < 80) {
            System.out.println("Grade: B");
        } else if (percentage >= 60 && percentage < 70) {
            System.out.println("Grade: C");
        } else if (percentage >= 50 && percentage < 60) {
            System.out.println("Grade: D");
        } else if (percentage >= 40 && percentage < 50) {
            System.out.println("Grade: E");
        } else {
            System.out.println("Grade: F");
        }
        scanner.close();
    }
}
