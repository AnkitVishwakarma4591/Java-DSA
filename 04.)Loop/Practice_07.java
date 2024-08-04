//  Print all even numbers till n.


import java.util.*;

public class Practice_07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++){
            if(i%2 == 0){
                System.out.println(i+" Even");
            }
        }

        sc.close();
    }
}
