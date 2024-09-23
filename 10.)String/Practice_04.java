// Substring

// String are immutable in java

public class Practice_04 {
    public static void main(String[] args){
        String sentance = "My name is Ankit";

        // substring(biging index,ending index);
        String name = sentance.substring(5,sentance.length());
        System.out.println(name);
        String name1 = sentance.substring(5,10);
        System.out.println(name1);
        String name2 = sentance.substring(5);
        System.out.println(name2);
        
    }
}
