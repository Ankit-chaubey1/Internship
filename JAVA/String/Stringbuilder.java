import java.util.*;
public class Stringbuilder{
    public static void main(String []args){

        //String bulder concept
        // StringBuilder sb=new StringBuilder("Hello");
        // System.out.println(sb);
        // sb.append("Ankit");
        // System.out.println(sb);
        // System.out.println(sb.reverse());

        // split concept
        // String text="apple,banana;cherry";
        // System.out.println(text);
        // String[] fruits = text.split("[,;]");
        // System.out.println(Arrays.toString(fruits));

        // //or
        // for(String i :fruits){
        //     System.out.print(i+" ");
        // }

        //plaindrome using StringBuilder
        
        StringBuilder s=new StringBuilder("racecar");
StringBuilder s1=new StringBuilder(s.reverse());
        System.out.println(s.equals(s1));

    }
}