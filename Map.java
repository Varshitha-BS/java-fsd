import java.util.*;
import java.util.Map.Entry;  
class Map{  
 public static void main(String args[]){  
  HashMap<Integer, String> map=new HashMap<Integer,String>();  
  map.put(100,"Amit");  
  map.put(101,"Vijay");    
  //Elements can traverse in any order  
  for(Entry<Integer, String> m:map.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}
