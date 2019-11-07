package sort;

import java.util.Arrays;

/**
 * 堆排序
 * author:fangjie
 * time:2019/11/6
 */
public class HeapSort implements MyArraySort{
    @Override
    public int[] sort(int[] src) {
        int[] arr=Arrays.copyOf(src,src.length);
        int len=arr.length;
        buildMaxHeap(arr,len);
        for (int i=len-1;i>0;i--)
        {
            swap(0,i,arr);
            heapify(arr,0,--len);
        }
        return arr;
    }

    private void heapify(int[] arr, int i, int len) {
        int left=i*2+1;
        int right=i*2+2;
        int idx=i;
        if(left<len&&arr[left]>arr[idx]) idx=left;
        if(right<len&&arr[right]>arr[idx]) idx=right;
        if(idx!=i)
        {
            swap(i,idx,arr);
            heapify(arr,idx,len);
        }
    }

    private void buildMaxHeap(int[] arr, int len) {
        for (int i=(len+1)/2;i>=0;i--) heapify(arr,i,len);
    }
}
