
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


/*
先排序。在遍历一个数，另两个数用双指针。

 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        if(nums == null){
            return null;
        }
        if(nums.length < 3){
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                if(nums[i] + nums[j] + nums[k] == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    set.add(list);
                    while(j < k && nums[j] == nums[j + 1]){
                        j++;
                    }
                    while(j < k && nums[k] == nums[k - 1]){
                        k--;
                    }
                    j++;
                    k--;
                }else if(nums[i] + nums[j] + nums[k] < 0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
