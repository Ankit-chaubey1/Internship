import java.util.*;
public class WordCounter {
    public static void main(String[] args) {
        String s=" Java is fun to learn";
        s=s.trim();
        
      int count=0;
      for(int i=0;i<s.length()-1;i++){
        if(s.charAt(i)==' '){
            count++;
        }
      }
      System.out.println(count+1);
    }
    
}
