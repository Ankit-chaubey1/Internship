import java.util.*;
public class CountUpperLowerDigit{
    public static void main(String[] args) {
        String s="Hello @123";
        int upper=0;
        int lower=0;
        int digit=0;
        int special=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isUpperCase(c)){
                upper++;
            }else if(Character.isLowerCase(c)){
                lower++;
            }else if(Character.isDigit(c)){
                digit++;
            }else{
                special++;
            }
        }
        System.out.println("upper: "+upper+" lower: "+lower+"digit "+digit+ "special "+special);
    }
}