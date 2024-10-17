// . Input an email from the user.You have to create a username from the email
//  by deleting the part that comes after ‘@’.Display that username to the user.


import java.util.*;
public class Practice_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Email id : ");
        String email = sc.nextLine();
        
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<email.length();i++){
            if(email.charAt(i) == '@'){
                break;
            }else{
                sb.append(email.charAt(i));
            }
        }
        System.out.println("Your Password is : "+sb);


        sc.close();
    }
}
