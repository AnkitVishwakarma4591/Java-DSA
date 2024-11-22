
/*
Print String in reverse order.
 */
import java.util.*;
public class String_reverse {
    public static void reverseString(String str, int index){
        if(index == 0){
            System.out.print(str.charAt(index)+" ");
            return;
        }
        System.out.print(str.charAt(index)+" ");
        reverseString(str, index-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any String : ");
        String str = sc.nextLine();
        int index = str.length();
        reverseString(str, index-1);
        sc.close();
    }
}