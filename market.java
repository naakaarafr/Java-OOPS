import java.util.Scanner;

public class market {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("unit price: ");
        double unitprice= input.nextDouble();
		System.out.print("quantity: ");
		int quantity= input.nextInt();
		System.out.println("Total Price:"+quantity*unitprice);
    }
}