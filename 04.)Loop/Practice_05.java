// Print the sum of first n Natural numbers

import java.util.*;
public class Practice_05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number :");
        int n = sc.nextInt();

        int sum = 0;
        for(int i=0; i<=n; i++){
            sum+=i;
        }
        System.out.println("Sum of number = "+ sum);

        sc.close();
    }
}
