// Write a function that takes in age as input and returns if that person is eligible
//  to vote or not. A person of age > 18 is eligible to vote.

import java.util.*;
public class Question_05 {
    public static void Vote(int age){
        if(age>18){
            System.out.println("eligible for Vote");
        }else{
            System.out.println("Not eligible for Vote");
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = sc.nextInt();

        Vote(age);

        sc.close();
    }
}
