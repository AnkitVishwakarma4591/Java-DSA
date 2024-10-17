//  Input a string from the user. Create a new string called ‘result’  in which you
//  will replace the letter ‘e’ in the original string with letter ‘i’ using StringBuilder.

import java.util.*;
public class Practice_05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'e'){
                sb.append('i');
            }else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println("After removing e from String the original String is : "+sb);

        sc.close();
    }
    
}
