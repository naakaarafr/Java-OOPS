import java.util.Scanner;
public class numbercheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nocheck= new int [5];
        for(int i=0; i<5; i++){
            System.out.println("Enter the number");
            int nocheck_input= sc.nextInt();
            nocheck[i]=nocheck_input;
        }
        for(int i=0; i<nocheck.length; i++){
            if (nocheck[i]>0){
                System.out.println("The number is positive"+ nocheck[i]);
                if (nocheck[i]%2==0){
                    System.out.println("The number is even"+ nocheck[i]);
                }
                else{
                    System.out.println("The number is odd"+ nocheck[i]);
                }}
            else if (nocheck[i]<0){
                System.out.println("The number is negative"+ nocheck[i]);
            }
            else{
                System.out.println("The number is zero"+ nocheck[i]);
            }}
        if(nocheck[0]==nocheck[4]){
            System.out.println("The first and last number are equal");
        }
        else if (nocheck[0]>=nocheck[4]){
            System.out.println("The first number is greater than the last number");
        }
        else{
            System.out.println("The last number is greater than the first number");
        }
    
    sc.close();

}}
