// Compare
public class Practice_03 {
    public static void main(String[] args){
        // Compare
        String name1 = "Ankit";
        String name2 = "Ankit";

        // 1 s1 > s2 : +ve  value
        // 2 s1 == s2 : 0
        // 3 s1 < s2 : -ve value

        // if(name1.compareTo(name2) == 0){
        //     System.out.println("String are equal");
        // }else{
        //     System.out.println("String are not equal");
        // }

        if(name1 == name2){
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }

        if(new String("Ankit") == new String("Ankit")){
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal"); 
        }
    }
}
