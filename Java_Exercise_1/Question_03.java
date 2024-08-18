// Write a function which takes in 2 numbers and returns the greater of those
//  two.

import java.util.*;
public class Question_03 {
    public static void grestestNumber(int a , int b){
        if(a>b){
            System.out.println(a+" is Greater");
        }else if(b>a){
            System.out.println(b+" is Greater");
        }else{
            System.out.println("Both number equal");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number :");
        int b = sc.nextInt();

        grestestNumber(a, b);

        sc.close();
    }
}
