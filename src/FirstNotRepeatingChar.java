import java.util.HashMap;
import java.util.Map;

public class FirstNotRepeatingChar {
    public void find(String string) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        for (i = 0; i < string.length(); i++) {
            map.put(string.charAt(i), 0);
        }
        for (i = 0; i < string.length(); i++) {
            map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
        }
        for (i = 0; i < string.length(); i++) {
            if (map.get(string.charAt(i)) == 1) {
                System.out.println(i);
                return;
            }
        }

    }
}
