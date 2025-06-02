import java.util.Scanner;
public class input{
	public static void main (String[] args){
		double km;
		Scanner input= new Scanner (System.in);
		km = input.nextInt();
		double kmtomiles= 1.6;
		double distanceinmiles= 1.6*km;
		System.out.println("The total miles is"+ distanceinmiles + " mile for the given" + km + "km");

	}
}