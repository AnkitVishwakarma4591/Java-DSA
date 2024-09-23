// 1. Concatenation
// 2. length
// 3. access character

public class Practice_02 {
    public static void main(String[] args){

        // Concatenation
        String name = "Ankit";
        String last = "Vishwakarma";
        String fullName = name + " " + last;
        System.out.println(fullName);

        // length of string
        System.out.println(fullName.length());

        // CharAt
        for(int i=0;i<fullName.length();i++){
            System.err.println(fullName.charAt(i));
        }


    }
}
