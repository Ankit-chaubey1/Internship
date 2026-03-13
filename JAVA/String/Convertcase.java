import java.util.*;
public class Convertcase {
    public static void main(String[] args) {
        String s="JaVa";
      StringBuilder s1=new StringBuilder();
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(Character.isLowerCase(c)){
            s1.append(Character.toUpperCase(c));
        }else if(Character.isUpperCase(c)){
            s1.append(Character.toLowerCase(c));
        }else{
            s1.append(c);
        }
      }
      System.out.println(s1);

    }
}
