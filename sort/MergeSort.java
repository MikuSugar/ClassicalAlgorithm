package sort;

import java.util.Arrays;

/**
 * 归并排序
 * author:fangjie
 * time:2019/11/5
 */
public class MergeSort implements MyArraySort {
    @Override
    public int[] sort(int[] src) {
        int[] arr=Arrays.copyOf(src,src.length);
        if(arr.length<=1)return arr;
        int mid=(arr.length+1)/2;
        return merge(sort(Arrays.copyOfRange(arr,0,mid)),sort(Arrays.copyOfRange(arr,mid,arr.length)));
    }

    private int[] merge(int[] left, int[] right) {
        int[] res=new int[left.length+right.length];
        int idx=0,lIdx=0,rIdx=0;
        while (lIdx<left.length&&rIdx<right.length)
        {
            if(left[lIdx]<right[rIdx]) res[idx++]=left[lIdx++];
            else res[idx++]=right[rIdx++];
        }
        while (lIdx<left.length)res[idx++]=left[lIdx++];
        while (rIdx<right.length)res[idx++]=right[rIdx++];
        return res;

    }
}
