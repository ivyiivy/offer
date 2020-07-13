import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            ArrayList<String> list1 = new ArrayList<>();
            int m=in.nextInt();
            for (int i = 0; i < m; i++) {
                list1.add(in.next());

            }
            ArrayList<String> list2 = new ArrayList<>();
            int n=in.nextInt();
            for (int i = 0; i < n; i++) {
                list2.add(in.next());
            }
            HashSet<String> set = new HashSet<>();
            set.addAll(list2);
            list2 = new ArrayList<>();
            list2.addAll(set);
            list2.sort((o1, o2) -> {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            });
            ArrayList<String> result = new ArrayList<>();
            for (int i = 0; i < list2.size(); i++) {
                boolean flag = false;
                int count = 0;
                for (int j = 0; j < list1.size(); j++) {
                    if (list1.get(j).contains(list2.get(i))) {
                        flag = true;
                        count++;
                    }
                }
                if (!flag) {
                    continue;
                } else {
                    result.add(list2.get(i) );
                    result.add(String.valueOf(count));
                    for (int j = 0; j < list1.size(); j++) {
                        if (list1.get(j).contains(list2.get(i))) {
                            result.add(String.valueOf(j));
                            result.add(list1.get(j));
                        }
                    }
                }
            }
            System.out.print(result.size() + " ");
            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i)+" ");
            }



        }
    }

}