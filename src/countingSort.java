public class countingSort {
    public void CountingSort(int[] data) {
        if (data == null) {
            return;
        }

        int max = data[0];
        int i, j = 0;
        for (i = 0; i < data.length; i++) {
            if (data[i] > max)
                max = data[i];

        }
        int[] count = new int[max+1];
        for (i = 0; i < data.length; i++) {
            count[data[i]]++;
        }
        for (i=0,j = 0; j <=max; j++) {
            while (count[j] != 0) {
                data[i++] = j;
                count[j]--;

            }
        }

    }
}
