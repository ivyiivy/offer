
public class eightQueen {

    public int Find(int[] array, int start) {
        if (start == 7) {
            if (!is_diagobal(array))
                return 1;

            else
                return 0;
        }
        int count = 0;
        for (int i = start, j = start; j <= 7; j++) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
            count = count + Find(array, start + 1);
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;

        }
        return count;

    }

    public boolean is_diagobal(int[] array) {

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 8; j++) {
                if ((array[i] - array[j] == i - j) || (array[i] - array[j] == j - i)) {
                    return true;
                }
            }
        }
        return false;
    }


}
