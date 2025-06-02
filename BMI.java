import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height in centimeters: ");
        double heightincm = scanner.nextDouble();
        double heightinm = heightincm / 100;
        double bmi = weight / (heightinm * heightinm);
        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Overweight");
        } else if (bmi >= 30) {
            System.out.println("Obesity");
        }
        scanner.close();
    }
}