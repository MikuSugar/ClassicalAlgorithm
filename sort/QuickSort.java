package sort;

import java.util.Arrays;

/**
 * 快速排序
 * author:fangjie
 * time:2019/11/5
 */
public class QuickSort implements MyArraySort{
    @Override
    public int[] sort(int[] src) {
        return quickSort(Arrays.copyOf(src,src.length),0,src.length-1);
    }

    private int[] quickSort(int[] arr, int left, int right) {
        if(left>=right)return arr;
        int pIdx=partition(arr,left,right);
        quickSort(arr,left,pIdx-1);
        quickSort(arr,pIdx+1,right);
        return arr;
    }

    private int partition(int[] arr, int left, int right) {
        int p=left;
        int idx=p+1;
        for (int i=idx;i<=right;i++)
        {
            if(arr[i]<arr[p])
            {
                swap(i,idx,arr);
                idx++;
            }
        }
        swap(p,idx-1,arr);
        return idx-1;
    }
}
