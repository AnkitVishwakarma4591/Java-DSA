// Write a program to enter the numbers till the user wants and at the end it
//  should display the count of positive, negative and zeros entered.


import java.util.*;
public class Question_07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input;
        int pve = 0;
        int nve = 0;
        int zero = 0;
        do{
            System.out.print("Enter any Number :");
            int n = sc.nextInt();
            if(n>0){
                pve+=1;
            }else if(n<0){
                nve++;
            }else{
                zero++;
            }
            System.out.print("want to continue ? :(yes(1) or No(0))");
            input = sc.nextInt();
        }while(input == 1);
        System.out.println(pve+" times Entered Positive Number");
        System.out.println(nve+" times Entered Negative Number");
        System.out.println(zero+" times Entered Zero Number");

        sc.close();
    }
}
