//其他数字重复三次，只有一个数字只出现一次

public class oneNumber {
    public Integer find(int [] array){
        if (array==null ||array.length==0)
            return null;
        int res=0;
        int [] bitnum=new int[32];
        for (int i=0;i<32;i++){
            for (int j=0;j<array.length;j++){
                bitnum[i]+=array[j]>>i&1;
            }
            res|=(bitnum[i]%3)<<i;
        }
        return res;
    }
}
