public class CountNumber {
    public int GetNumberofK(int [] array,int k)throws Exception{
        if (array==null ||array.length==0)
            throw new Exception("Invalid input!");
        int count=0;
//        for (int i=0;i<array.length;i++){
//            if (array[i]<k)
//                continue;
//            else if (array[i]>k)
//                break;
//            else
//                count++;
//        }
//        return count;
        int start=0;
        int end=array.length-1;
        int mid = 0;
        while(start<end){
            mid=(start+end)/2;
            if (k<array[mid])
                end=mid-1;
            else if (k>array[mid])
                start=mid+1;
            else
                break;
        }
        if (array[mid]!=k)
            return 0;
        int i=mid,j=mid;
        count++;
        while(i>0){
            if(array[i-1]==k){
                count++;
                i--;
            }
            else
                break;
        }
        while(j<array.length-1){
            if (array[j+1]==k){
                count++;
                j++;
            }
            else break;
        }

        return count;

    }
}
