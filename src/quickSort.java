public class quickSort {
    public static void main(String[] args) {
        int []arr={5,2,4,3,1,8};
        quickSort(arr,0,arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void quickSort(int[] data, int start, int end) {
        int p = partition(data, start, end);
        if (p == -1) {
            System.out.println("存在错误输入");
            return;
        }
        if (p > start +1)
            quickSort(data, start, p - 1);
        if (p < end - 1)
            quickSort(data, p + 1, end);

    }


    private static int partition(int[] array, int start, int end) {
        int s = array[start];
        int i = start;
        int j = end;
        while (i < j) {
            while (array[j] >= s && i<j) {
                j--;
            }
            array[i]=array[j];
            while (array[i] <= s&& i<j) {
                i++;
            }
            array[j]=array[i];

        }
        array[i]=s;
        return i;

    }
    //    public static int partition(int[] data, int start, int end) {
//        if (start < 0 || end >= data.length || data == null) {
//            return -1;
//        }
//        int small = start - 1;
//        int index = start;
//        int tmp;
//        for (; index < end; index++) {
//            if (data[index] < data[end]) {
//                small++;
//                if (index != small) {
//                    tmp = data[index];
//                    data[index] = data[small];
//                    data[small] = tmp;
//                }
//
//
//            }
//        }
//        small++;
//        tmp = data[end];
//        data[end] = data[small];
//        data[small] = tmp;
//        return small;
//    }

}
