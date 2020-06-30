import java.util.ArrayList;

/*
找到和为某个值的所有连续序列
 */
public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {

        ArrayList<ArrayList<Integer>> list =new ArrayList<>();
        if(sum<3)
            return list;
        int small=1;
        int big=2;
        int cursum=3;
        while(small<(sum+1)/2){
            while(cursum>sum&&small<(sum+1)/2){
                cursum-=small;
                small++;
            }
            if(cursum==sum){
                list.add(List(small,big));
            }
            big++;
            cursum+=big;
        }
        return list;

    }
    private ArrayList<Integer> List(int small ,int big){
        ArrayList list = new ArrayList();
        for(int i=small;i<=big;i++){
            list.add(i);
        }
        return list;
    }
}