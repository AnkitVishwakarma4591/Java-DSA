// StringBuilder
// charAt access
// set charAt
// insert char
// delete
// import java.util.*;
public class Practice_01 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Ankit");
        System.out.println(sb);

        // Access index
        System.out.println(sb.charAt(0));

        // set charAt 0
        sb.setCharAt(0,'M');
        System.out.println(sb);

        // insert char 
        sb.insert(0,"S");
        System.out.println(sb);

        // delete char from index
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
