public class GetUglyNumber_Solution {
    /*
    获取丑数（因子只有2/3/5）
     */
    //丑数乘以2,3,5还是丑数
    public  int GetUglyNumber_Solution(int index) {
        if (index<=0){
            return 0;
        }
        int []result=new int[index];
        result[0]=1;
        int p2=0,p3=0,p5=0;
        for (int i=1;i<index;i++){
            result[i]=Math.min(result[p2]*2,Math.min(result[p3]*3,result[p5]*5));
            if (result[i]==result[p2]*2) p2++;
            if (result[i]==result[p3]*3) p3++;
            if (result[i]==result[p5]*5) p5++;
        }
        return result[index-1];
    }

    //一个一个判
    private  boolean is_UglyNumber(int i){
        while(i%2==0){
            i=i/2;
        }
        while (i%3==0){
            i=i/3;
        }
        while(i%5==0){
            i=i/5;
        }
        if (i==1){
            return true;
        }
        return false;
    }

}
