// 1.Make a Calculator. Take 2 numbers (a & b) from the user and an
// operation as follows :
//   1 : + (Addition) a + b
// ● 2:-(Subtraction) a- b
// ● 3:*(Multiplication) a * b
// ● 4:/(Division) a / b
// ● 5:%(Moduloorremainder) a % b
// Calculate the result according to the operation given and
// display it to the user.



import java.util.*;
public class Practice_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number :");
        int b = sc.nextInt();
        System.out.print("Enter operation(+,-,*,/,%) :");
        String ch = sc.next();

        int sum = a+b;
        int diff = a-b;
        double multiply = a*b;
        double div = a/b;
        double rem = a%b;


        switch(ch){
            case "+" : System.out.println("Sum of number :" + sum);
                        break;
            case "-" : System.out.println("difference of number :" + diff);
                        break;
            case "*" : System.out.println("multiplication of number :" + multiply);
                        break;
            case "/" : System.out.println("Division of numer :" + div);
                        break;
            case "%" : System.out.println("Moduloor of number :" + rem);
                        break;
            default : System.out.println("Invalid enter");
        }

        sc.close();
    }
}
