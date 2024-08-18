//  Enter 3 numbers from the user & make a function to print their average

import java.util.*;
public class Question_01 {
    public static float Average(int a , int b, int c){
        int sum = a+b+c;
        float avg = sum/3;

        return avg;
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter 3 number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Average(a, b, c);
        System.out.println("Average of three number : "+ Average(a, b, c));

        sc.close();
    }
}
