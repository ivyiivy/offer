import java.util.Scanner;
/*
计算字符在字符串中出现次数，不计大小写
 */

public class CountChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine().toLowerCase();//把字符串转成小写
        char c = in.nextLine().toLowerCase().charAt(0);
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (c == str1.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);

    }
}
