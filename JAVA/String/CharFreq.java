import java.util.*;
public class CharFreq{
    public static void main(String[] args) {
        // String s="Abrakadabra";
        //s=s.trim();
        // if(s.isBlank()){
        //     System.out.println(0);
        // }
        // int count=0;
        // for(int i=0;i<s.length()-1;i++){
        //     count++;
        // }
        // System.out.println(count);

        //how many times a repeats
         String s="Abrakadabra";
         s=s.toLowerCase();
      
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
count++;
            }
        }
        System.out.println(count);
    }
}