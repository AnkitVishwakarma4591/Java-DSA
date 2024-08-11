// Calculate Sum of two number using function.


import java.util.*;
public class Practice_02 {
    public static int print_Sum(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter 1st number :");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number :");
        int b = sc.nextInt();

        int sum = print_Sum(a, b);
        System.out.println("Sum of two number is :"+sum);
        sc.close();

    }
}
