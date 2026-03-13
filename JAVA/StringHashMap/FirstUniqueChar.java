import java.util.*;
public class FirstUniqueChar{
    public static void main(String[]args){
        String s="swiss";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
           map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(map.get(c)==1){
                System.out.print(c);
                return;
            }
        }

    }
}