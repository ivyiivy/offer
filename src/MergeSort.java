
public class MergeSort {
    public void mergrSort(int [] array, int start, int end){
        if (end-start<=1){
            if (array[start]>array[end]){
                int tmp=array[start];
                array[start]=array[end];
                array[end]=tmp;
                return ;
            }
        }
        int mid=(start+end)/2;
        mergrSort(array,start,mid);
        mergrSort(array,mid+1,end);

    }
}
