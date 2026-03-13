import java.util.*;
public class LongestWord{
    public static void main(String[]args){
        String word="hii he is Ankit";
        String[]res=word.split(" ");
        String longest="";
        for(String i: res){
            if(i.length()>longest.length()){
                longest=i;
            }
        }
        System.out.println(longest);
    }
}