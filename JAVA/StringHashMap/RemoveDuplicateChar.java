import java.util.*;
public class RemoveDuplicateChar{
    public static void main(String[]args){
        String s="programming";
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!map.containsKey(c)){
                res.append(c);
                map.put(c,1);
            }
        }
        System.out.print(res);
    }
}