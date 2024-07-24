// How to take input from users

import java.util.*;

public class Practice_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variable
        String Full_Name = sc.nextLine();
        int age = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(Full_Name);
        System.out.println(age);
        System.out.println(sum);



        sc.close();
    }
    
}
