import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/*
打印出排列成最小数字的数组排列
 */
public class PrintMinNumber {
    public String printMinNumber(int[] numbers) {
        ArrayList<String> s = new ArrayList<>();
        if (numbers.length == 0) {
            return s.get(0);
        }
        for (int i = 0; i < numbers.length; i++) {
            s.add(String.valueOf(numbers[i]));
        }
        Collections.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s1.compareTo(s2);
            }


        });
        String str = s.get(0);
        for (int i = 1; i < s.size(); i++) {
            str = str + s.get(i);
        }
        return str;
    }
}