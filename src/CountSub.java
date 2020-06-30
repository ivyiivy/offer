import java.util.Scanner;

public class CountSub {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String sub = in.nextLine();


        int count = 0;
        if (str.contains(sub)) {
            String replace = str.replace(sub, "");
            count = (str.length() - replace.length()) / (sub.length());
        }
        System.out.println(count);
    }


}


