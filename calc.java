import java.util.Scanner;
public class calc{
	public static void main (String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter num 1: ");

        double num1 = input.nextDouble();

        System.out.print("Enter num 2: ");

        double num2= input.nextDouble();
		double add = num1+num2;
		double multiply= num1*num2;
		double subtract= num1-num2;
		double divide= num1/num2;
		System.out.println("enter your choice");
		System.out.println("1) Add");
		System.out.println("2) Subtract");
		System.out.println("3) Multiply");
		System.out.println("4) Divide");
		int choice = input.nextInt();
		if (choice==1){
			System.out.println(add);}
		else if (choice==2){
			System.out.println(subtract);}
		else if (choice==3){
			System.out.println(multiply);}
		else if (choice==4){
			System.out.println(divide);}
		else{
			System.out.println("error");}
	}
}