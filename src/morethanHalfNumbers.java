import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class morethanHalfNumbers {
    public int MoreThanHalfNum_Solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int maxnumber = 0;
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], 0);
        }
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.get(array[i]) + 1);
        }
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) > max) {
                max = map.get(array[i]);
                maxnumber = array[i];
            }
        }
        if (max <= array.length >> 1)
            maxnumber = 0;
        return maxnumber;
    }

}
