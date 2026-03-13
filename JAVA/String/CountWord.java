import java.util.*;
public class CountWord{
    public static void main(String[]args){
        String sentence="Java is very funny!";
       String[]words= sentence.split(" ");
        System.out.println(words.length());
    }
}