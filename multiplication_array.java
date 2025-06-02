import java.util.Scanner;
public class multiplication_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int input= sc.nextInt();
        int [] multiplication= new int [10];
        for(int i=1;i<=10;i++){
            multiplication[i-1]=input*i;
            }
            for(int i=0;i<10;i++){
                System.out.println(input+"*"+(i+1)+"="+multiplication[i]);
            }
        sc.close();
        }
}
