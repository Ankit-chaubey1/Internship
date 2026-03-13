import java.util.*;
public class AlphaOnly {
    public static void main(String[] args) {
        String s="H3110_w0rld!";
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetter(c)){
                res.append(c);
            }else{continue;}
        }
System.out.println(res);
    }
}
