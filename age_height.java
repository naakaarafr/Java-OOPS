import java.util.Scanner;
public class age_height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amar's age: ");
        int age_amar = sc.nextInt();
        System.out.println("Enter Amar's height: ");
        int height_amar = sc.nextInt();
        System.out.println("Enter Akbar's age: ");
        int age_akbar = sc.nextInt();
        System.out.println("Enter Akbar's height: ");
        int height_akbar = sc.nextInt();
        System.out.println("Enter Anthony's age: ");
        int age_anthony = sc.nextInt();
        System.out.println("Enter Anthony's height: ");
        int height_anthony = sc.nextInt();
        if (age_amar < age_akbar && age_amar < age_anthony) {
            System.out.println("Amar is the youngest");
        }
        else if (age_akbar < age_amar && age_akbar < age_anthony) {
            System.out.println("Akbar is the youngest");
        }
        else {
            System.out.println("Anthony is the youngest");
        }
        if(height_amar > height_akbar && height_amar > height_anthony) {
            System.out.println("Amar is the tallest");
        }
        else if(height_akbar > height_amar && height_akbar > height_anthony) {
            System.out.println("Akbar is the tallest");
        }   
        else {
            System.out.println("Anthony is the tallest");
        }
        sc.close();

    }
}
