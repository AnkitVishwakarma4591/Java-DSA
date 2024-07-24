// Take a number from user and check the number is odd or Even;

import java.util.*;
public class Practice_02 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.println(num+" is Even");
        }else{
            System.out.println(num+" is Odd");
        }
        sc.close();
    }
}
