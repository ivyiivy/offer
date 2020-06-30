public class findGreatestNumberofArray {
    /*
    最大连续子序列的和
     */
    public int FindGreatestSumOfSubArray(int[] array) throws Exception {
        if (array==null)
            throw new Exception("Invalid input");
        int[] maxsum = new int[array.length];
        int i = 0;
        int max = Integer.MIN_VALUE;
        for (; i < maxsum.length; i++) {
            maxsum[i] = 0;
        }
        maxsum[0] = array[0];
        for (i = 1; i < maxsum.length; i++) {
            if (maxsum[i - 1] <= 0)
                maxsum[i] = array[i];
            else
                maxsum[i] = array[i] + maxsum[i - 1];
        }
        for (i = 0; i < maxsum.length; i++) {
            if (maxsum[i] > max)
                max = maxsum[i];
        }
        return max;
    }
}
