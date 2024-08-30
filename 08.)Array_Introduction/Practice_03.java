// Take an array as input from the user search for a given number  X and 
// print the index at which it occurs.
import java.util.*;
public class Practice_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int array[] = {10,82,63,45,52,66,67,88,79,50};
        System.out.print("Enter number that u want to search : ");
        int x = sc.nextInt();
        for(int i=0 ; i<array.length;i++){
            if(array[i] == x){
                System.out.println("Found at index "+i);
            }else{
                System.out.println("not Found");
            }

        }




        // System.out.print("Enter size of Array : ");
        // int size = sc.nextInt();
        // int number[] = new int[size];
        // for(int i=0 ; i<size ; i++){
        //     number[i] = sc.nextInt();
        // }
        // System.out.print("Enter number that u want to search :");
        // int x = sc.nextInt();
        // for(int i=1 ; i<size ; i++){
        //     if(number[i] == x){
        //         System.out.println("Found at index "+ i);
        //     }
        // }
        sc.close();
    }
}
