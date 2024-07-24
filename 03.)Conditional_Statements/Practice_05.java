// Switch

import java.util.*;
public class Practice_05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Click Buttom (1,2,3) :");
        int Buttom = sc.nextInt();

        switch(Buttom){
            case 1 : System.out.println("Hello!");
                        break;
            case 2 : System.out.println("Namaste!");
                        break;
            case 3 : System.out.println("Bonjour!");
                        break;
            default : System.out.println("Invaild Buttom");
        }

        sc.close();
    }
}
