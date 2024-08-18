// Two numbers are entered by the user, x and n. Write a function to find
//  the value of one number raised to the power of another i.e. x^n.


import java.util.*;
public class Question_08 {
    public static double Power(int x,int n){
        double pow = Math.pow(x, n);
        return pow;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number :");
        int x = sc.nextInt();
        System.out.print("Enter power number :");
        int n = sc.nextInt();

        System.out.println(x+" To the Power "+n+" = "+Power(x, n));

        sc.close();
    }
}
