import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 第一种方法，建立一个大顶堆一个小顶堆，保证大顶堆的堆顶小于小顶堆的堆顶
 * 第二种方法：分治思想，根据二进制位比较，从第一位开始比较，将数据存于两个文件中，然后根据两文件数据量继续往下比较。
 */

public class MidNumber {
    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    static PriorityQueue<Integer> minHeap = new PriorityQueue<>(Integer::compareTo);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (maxHeap.isEmpty() || a[i] < maxHeap.peek()) {
                maxHeap.add(a[i]);
            } else {
                minHeap.add(a[i]);
            }
        }
        while (maxHeap.size() - minHeap.size() > 1) {
            minHeap.add(maxHeap.poll());
        }
        while (minHeap.size() - maxHeap.size() > 1) {
            maxHeap.add(minHeap.poll());
        }
        if (maxHeap.size() == minHeap.size()) {
            System.out.println((maxHeap.peek() + minHeap.peek()) / 2.0);
        } else if (maxHeap.size() > minHeap.size()) {
            System.out.println(maxHeap.peek());
        } else {
            System.out.println(maxHeap.peek());
        }


    }
}
