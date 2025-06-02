import java.util.Scanner;

public class dist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Distance in feet: ");
        double distinfeet= input.nextDouble();
		double distinyard= distinfeet*0.66;
		double distinmiles= distinyard*0.000568182;
		System.out.println("feets:"+ distinfeet + "yards:"+distinyard+"miles:"+distinmiles);
    }
}