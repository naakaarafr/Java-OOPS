import java.util.Scanner;
public class max_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] array= new double [10];
        double total=0.0;
        int i=0;
        while(true){
            System.out.println("Enter the number");
            double input= sc.nextDouble();
            if (input!=0){
                array[i]=input;
                i++;
                if (i==10){
                    break;
                }
            }
            else
            { break;}}
        for (int j=0;j<10;j++){
            total=total+array[j];}
        System.out.println("The total is "+total);
        sc.close();
    }
}
