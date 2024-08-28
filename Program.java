//import stuff here
import java.util.Scanner;
//Your code here

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int k2SB = 20;
        final int sn2SB = 240;
        double k;
        double sn;
        double SB;
        System.out.print("\nEnter Schrute-Bucks: ");
        SB = sc.nextDouble();
        System.out.print("\nEnter Klevins: ");
        k = sc.nextDouble();
        System.out.print("\nEnter Stanley-Nickels: ");
        sn = sc.nextDouble();
        double sumSB = k/k2SB + sn/sn2SB + SB;
        double newSB = Math.round(sumSB * 100) / 100.0;
        System.out.println("\nDecimal Schrute-Bucks: $"+ newSB);
        

        }
}
//Paste console output below:
/*
Enter Schrute-Bucks: 7

Enter Klevins: 17

Enter Stanley-Nickels: 9

Decimal Schrute-Bucks: $7.89

*/
