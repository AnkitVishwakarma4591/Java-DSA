// Use of comparig two number;

import java.util.*;
public class Practice_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two number :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            System.out.println("Equal");
        }else{
            if(a>b){
                System.out.println(a+" is Greater");
            }else{
                System.out.println(b+" is Greater");
            }
        }
        sc.close();
    }
}
