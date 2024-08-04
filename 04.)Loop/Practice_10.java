//  Qs. Print if a number is prime or not (Input n from the user).
//  [In this problem you will learn how to check if a number is prime or not]

import java.util.*;

public class Practice_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter number to check Prime or Not : ");
        int n = sc.nextInt();
        for(int i = 1 ;i<=n;i++){
            if(n%i == 0){
                count+=1;
            }
        }
        if(count == 2){
            System.out.println(n+" is Prime");
        }else{
            System.out.println(n+" is Not a Prime");
        }
        sc.close();
    }
}
