import java.util.*;
public class StringCompression{
    public static void main(String[]args){
        String s="aaabbc";
        int count=1;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }else{
                res.append(s.charAt(i)).append(count);
                count=1;
            }
        }
        res.append(s.charAt(s.length()-1)).append(count);
        System.out.print(res);
    }
}