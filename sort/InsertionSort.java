package sort;

import java.util.Arrays;

/**
 * 插入排序
 * author:fangjie
 * time:2019/11/5
 */
public class InsertionSort implements MyArraySort{
    @Override
    public int[] sort(int[] src) {
        int[] arr=Arrays.copyOf(src, src.length);
        for (int i=1;i<arr.length;i++)
        {
            int temp=arr[i];
            int j=i;
            while (j>0&&temp<arr[j-1])
            {
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
        return arr;
    }
}
