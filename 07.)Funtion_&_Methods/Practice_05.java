// Make a function to check if a number is prime or not


import java.util.*;
public class Practice_05 {
    public static void checkNumber(int a){
        int count = 0;
        for(int i=1;i<=a;i++){
            if(a%i == 0){
                count+=1;
            }
        }
        if(count == 2){
            System.out.println(a+" is Prime");
        }
        else{
            System.out.println(a+" Not Prime");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a = sc.nextInt();

        checkNumber(a);

        sc.close();
    }
}
