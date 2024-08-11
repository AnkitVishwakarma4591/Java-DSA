//  Make a function to check if a given number n is even or not.


import java.util.*;
public class Practice_06 {
    public static void checkNumber(int n){
        if(n%2 == 0){
            System.out.println(n+" is Even");
        }else{
            System.out.println(n+" Not Even");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        int a =sc.nextInt();

        checkNumber(a);

        sc.close();
    }
}
