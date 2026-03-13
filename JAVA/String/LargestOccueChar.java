import java.util.*;

public class LargestOccueChar {  
      public static void main(String[] args) {
        
    
    String s="success";
    HashMap<Character,Integer> map=new HashMap<>();

    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
map.put(c,map.getOrDefault(c, 0)+1);
    }
int maxcount=-1;
char  maxchar=' ';
for(Map.Entry<Character,Integer> entry:map.entrySet()){
    if(entry.getValue()>maxcount){
        maxcount=entry.getValue();
        maxchar=entry.getKey();
    }
}
System..out.print(maxchar+" "+maxcount);
  
    }
}
