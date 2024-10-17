// Take an array of Strings input from the user & find the cumulative (combined)
//  length of all those strings using Stringbuilder

import java.util.*;
public class Practice_04 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter number of String : ");
        int size = sc.nextInt();
        String arr[] = new String[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+(i+1)+" String :");
            arr[i] = sc.next();
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }

        int total_len = sb.length();

        System.out.println("cumulative length of all strings : "+total_len);
        sc.close();

    }
}
