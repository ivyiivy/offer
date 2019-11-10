//The characters of two strings are all the same
//the length of two strings are the same

import java.util.HashMap;
import java.util.Map;

public class isAnagram {
    public boolean IsAnagram(String str1,String str2){
        if (str1 == null||str2==null)
            return false;
        if (str1.length()!=str2.length())
            return false;
        Map<Character,Integer> map=new HashMap<>();
        int i=0;
        int len=str1.length();
        for (;i<len;i++){
            map.put(str1.charAt(i),0);
        }
        for (i=0;i<len;i++){
            map.put(str1.charAt(i),map.get(str1.charAt(i))+1);
        }
        for (i=0;i<len;i++){
            if (map.containsKey(str2.charAt(i))) {
                map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
            }
            else
                return false;
        }
        for (i=0;i<len;i++){
            if (map.get(str1.charAt(i))!=0)
                return false;
        }
        return true;


    }
}
