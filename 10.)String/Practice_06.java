//  Input a string from the user. Create a new string called ‘result’  in which you
//  will replace the letter ‘e’ in the original string with letter ‘i’.
import java.util.*;
public class Practice_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any sentence : ");
        String original = sc.nextLine();
        String result = "";
        for(int i=0;i<original.length();i++){
            if(original.charAt(i) == 'e'){
                result += 'i';
            }else{
                result += original.charAt(i);
            }
        }
        System.out.println(result);

        sc.close();
    }
}
