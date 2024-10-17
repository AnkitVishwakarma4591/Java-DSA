// . Input an email from the user.You have to create a username from the email
//  by deleting the part that comes after ‘@’.Display that username to the user.
//  Example:
//  email = “apnaCollegeJava@gmail.com”; username = “apnaCollegeJava”
//  email = “helloWorld123@gmail.com”; username = “helloWorld123”

import java.util.*;
public class Practice_07 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your to create password :");
        String email = sc.nextLine();
        String password = "";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i) == '@'){
                break;
            }else{
                password += email.charAt(i);
            }
        }
        System.out.println("Your password is :"+password);
        sc.close();
    }
}