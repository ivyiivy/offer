public class quickSort {
    public int partition(int[] data, int start, int end) {
        if (start < 0 || end >= data.length || data == null) {
            return -1;
        }
        int small = start - 1;
        int index = start;
        int tmp;
        for (; index < end; index++) {
            if (data[index] < data[end]) {
                small++;
                if (index != small) {
                    tmp = data[index];
                    data[index] = data[small];
                    data[small] = tmp;
                }


            }
        }
        small++;
        tmp = data[end];
        data[end] = data[small];
        data[small] = tmp;
        return small;
    }

    public void QuickSort(int[] data, int start, int end) {
        if (start == end)
            return;
        int p = partition(data, start, end);
        if (p == -1) {
            System.out.println("存在错误输入");
            return;
        }
        if(p>start)
        QuickSort(data, start, p-1);
        if (p<end)
        QuickSort(data, p+1, end);

    }
}
