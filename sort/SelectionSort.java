package sort;

import java.util.Arrays;

/**
 * 选择排序
 * author:fangjie
 * time:2019/11/5
 */
public class SelectionSort implements MyArraySort {
    @Override
    public int[] sort(int[] src) {
        int[] arr=Arrays.copyOf(src, src.length);
        for (int i=0;i<arr.length-1;i++)
        {
            int minIdx=i;
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minIdx])minIdx=j;
            }
            swap(minIdx,i,arr);
        }
        return arr;
    }
}
