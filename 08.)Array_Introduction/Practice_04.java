// Take an array of names as input from the user and print them on the screen.
import java.util.*;
public class Practice_04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of names :");
        int size = sc.nextInt();
        String name[] = new String[size];

        // input
        for(int i=0 ; i<name.length ; i++){
            System.out.print("Enter "+ (i+1) +" name : ");
            name[i] = sc.next();
            System.out.println();
        }

        // output
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }

        sc.close();
    }
}
