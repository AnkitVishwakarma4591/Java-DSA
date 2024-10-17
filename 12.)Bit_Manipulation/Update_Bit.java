// Update_Bit
// Set the 2rd bit (position =1) of a number n to 1. (n = 0101)
// Condition 
// 1 for 0
// i. Bit Mask : 1<<i;
// ii. Operation : AND with NOT

// 2 for 1
// i. Bit Mask : 1<<i;
// ii. Operation : OR;

import java.util.Scanner;

public class Update_Bit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 or 0 :");
        int ope = sc.nextInt();
        int n=5;
        int pos = 1;
        int BitMask = 1<<pos;
        if(ope == 0){
            int NotBitMask = ~(BitMask);
            int newNumber = NotBitMask & n;
            System.out.println(newNumber);
        }
        else{
            int newNumber = BitMask | n;
            System.out.println(newNumber);
        }

        sc.close();
    }
}
