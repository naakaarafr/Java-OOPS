

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        int [] age= new int [10];
        int age_input;
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<10; i++)
        {
            System.out.println("Enter your age");
            age_input= sc.nextInt();
            age[i]=age_input;
        }
        for (int i=0; i<age.length; i++)
        {
            if ( age[i]>=18)
            {
                System.out.println("You are eligible to vote"+ age[i]);
            }
            else
            {
                System.out.println("You are not eligible to vote"+ age[i]);
            }
        }
        sc.close();
    }
}
