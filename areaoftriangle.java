import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Base (cm): ");
        double base = input.nextDouble();

        System.out.print("Height (cm): ");
        double height = input.nextDouble();

        double areaCm2 = (base * height) / 2;
        double areaIn2 = areaCm2 * 0.15500031;
        double areaFt2 = areaCm2 * 0.00107639104;

        System.out.println("Triangle Area:");
        System.out.println(" - " + areaCm2 + " cm²");
        System.out.println(" - " + areaFt2 + " ft²");
        System.out.println(" - " + areaIn2 + " in²");

        input.close();
    }
}
