// Write a program to print Fibonacci series of n terms where n is input
//  by user :
//  0 1 1 23581321.....
//  In the Fibonacci series, a number is the sum of the previous 2 numbers that
//  came before it.
//  (BONUS) 


import java.util.*;
public class Question_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number  of term : ");
        int n = sc.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        for(int i=1 ; i<=n ; i++){
            System.out.print(firstTerm+" ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        sc.close();
    }
}
