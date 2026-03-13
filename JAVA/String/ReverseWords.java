import java.util.*;
public class ReverseWords{
    public static void main(String[]args){
        String sentence="Learn java step by step";
        // String res=sentence.replace(" ","-");
        // System.out.println(res);


        String[] res=sentence.split(" ");

        // for(int i=res.length-1;i>=0;i--){
        //     System.out.print(res[i]+" ");
        // }
        StringBuilder finalres=new StringBuilder();
        for(int i=0;i<res.length;i++){
           StringBuilder temp=new StringBuilder(res[i]);
           temp.reverse();

           finalres.append(temp).append(" ");

        }
System.out.println(finalres);
    }
}