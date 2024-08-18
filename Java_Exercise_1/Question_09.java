//  Write a function that calculates the Greatest Common Divisor of 2 numbers.
//  (BONUS)

import java.util.*;
public class Question_09 {
    public static int calculateGCD(int a,int b){
        int gcd = 1;
        for(int i=1 ; i<=Math.min(a,b);i++){
            if(a%i == 0 && b%i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The GCD of "+ a+" and "+b+" is "+ calculateGCD(a, b));

        sc.close();
    }
}
