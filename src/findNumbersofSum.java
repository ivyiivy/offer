import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class findNumbersofSum {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList list = new ArrayList();
        if (array == null)
            return null;
        if (array.length == 0)
            return list;
        Map<Integer, Integer> map = new HashMap<>();

        int minproduct = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], 1);
            if (map.containsKey(sum - array[i])) {
                if (map.get(sum - array[i]) == 1) {
                    if (array[i] * (sum - array[i]) < minproduct) {
                        map.put(minproduct, sum - array[i]);
                    }
                }
            }

        }
        if (map.containsKey(minproduct)) {
            list.add(map.get(minproduct));
            list.add(sum - map.get(minproduct));
        }
        return list;


    }

}
