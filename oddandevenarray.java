import java.util.Scanner;
public class oddandevenarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int size=(number/2)+1;
        int [] even= new int[size];
        int [] odd= new int[size];
        for(int i=0; i<= number;i++)
        {
            if(i%2==0)
            {
                even[i]=i;
            }
            else
            {
                odd[i]=i;
            }
        }
        System.out.println("Even numbers are: "+ even);
        System.out.println("Odd numbers are: " + odd);
        input.close();}
}
