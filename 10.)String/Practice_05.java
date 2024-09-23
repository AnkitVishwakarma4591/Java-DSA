// Take an array of Strings input from the user & find the cumulative(combined)
//  length of all those strings.

import java.util.*;
public class Practice_05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Taking input from the user
        System.out.print("Enter size of Array :");
        int size = sc.nextInt();
        String str[] = new String[size]; 

        int strlen = 0;
        for(int i=0;i<size;i++){
            System.out.println("Enter "+(i+1)+" string : ");
            str[i] = sc.next();
            strlen+=str[i].length();
        }
        System.out.println("Length of String : "+strlen);
        sc.close();
    }
}
