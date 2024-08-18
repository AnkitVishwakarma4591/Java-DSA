//  Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;
public class Question_02 {
    public static int sumOdd(int n){
        int sum = 0;
        for(int i=1 ; i<=n; i++){
            if(i%2 != 0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a = sc.nextInt();

        sumOdd(a);
        System.out.println("Sum of all Odd number between 1 to "+a+" :"+sumOdd(a));

        sc.close();
    }
}
