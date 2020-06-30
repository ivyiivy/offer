public class FindDuplicate {
    /*
    给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
示例 1:
输入: [1,3,4,2,2]
输出: 2
     */
    /*
    将1-n的数组位置按下标值放置，如果没有重复的，那重复的一定是nums[0];
     */
    public int findDuplicate(int[] nums) {
        if(nums.length<=2){
            return 1;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]==i){
                continue;
            }
            else{
                while(nums[i]!=i){
                    if(nums[i]==nums[nums[i]]){
                        return nums[i];
                    }
                    int tmp=nums[nums[i]];
                    nums[nums[i]]=nums[i];
                    nums[i]=tmp;
                }
            }
        }
        return nums[0];

    }
}
