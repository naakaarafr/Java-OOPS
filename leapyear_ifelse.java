import java.util.Scanner;
public class leapyear_ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if (year< 1582) {
            System.out.println("Not within the Gregorian calendar period");
            if(year%4==0){
                System.out.println("leap year");
                if(year%100==0){
                    System.out.println("Not a leap year");
                    if(year%400==0){
                        System.out.println("leap year");
                    }
                }
            }
            else{
                System.out.println("Not a leap year");
            }
        }
        scanner.close();
    }
}
