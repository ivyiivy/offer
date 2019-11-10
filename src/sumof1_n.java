public class sumof1_n {
    public int sum(int n){
        int sum = n;
        boolean bool=(n>0)&&((sum+=sum(n-1))>0);
        return sum;
    }
}
