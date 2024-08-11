// Find the Factorial of a number using function.


import java.util.*;
public class Practice_04 {
    public static int  calculateFactorial(int a){
        
        int fact = 1;
        for(int i=1 ; i<=a;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter any number :");
        int a = sc.nextInt();
        calculateFactorial(a);
        System.out.println("Factorial of a number :"+calculateFactorial(a));
        sc.close();
    }
    
}
