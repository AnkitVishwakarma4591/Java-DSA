// Print the table of a number input by the user.

import java.util.*;
public class Practice_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to print a table : ");
        int n = sc.nextInt();

        int i=1;
        while (i<=10) {
            System.out.println(n + "*" + i + "=" + n*i);
            i++;
        }

        sc.close();
    }
}
