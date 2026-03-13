import java.util.*;
public class RemoveVowel {
    public static void main(String[] args) {
        String s="Incredible";
        s=s.toLowerCase();
        
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u'){
                continue;
               
            }else{
                 res.append(c);
            }
        }
        System.out.println(res);
    }
}
