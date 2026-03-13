import java.util.*;
public class VowelConstCount {
    public static void main(String[] args) {
        String s="java 123 @#";
        s=s.trim();
        String vowels="aeiouAEIOU";
        String consts="bcdfghjklmnpqrstnvwxyzBCDFGHJKLMNPQRSTNVWXYZ";
        int vowelcount=0;
        int constcount=0;
for(int i=0;i<s.length();i++){
    char c=s.charAt(i);
    if(Character.isLetter(c)){
        if(vowels.indexOf(c)==-1){
            constcount++;
        }else{
            vowelcount++;
        }
    }
}
System.out.println(vowelcount);
    System.out.println(constcount);
    }
    
}
