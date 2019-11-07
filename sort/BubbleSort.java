package sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * author:fangjie
 * time:2019/11/5
 */
public class BubbleSort implements MyArraySort{

    @Override
    public int[] sort(int[] src) {
        int[] arr=Arrays.copyOf(src, src.length);
        for (int i=1; i<src.length; i++)
        {
            boolean flag=true;
            for (int j=0; j<src.length-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(j,j+1,arr);
                    flag=false;
                }
            }
            if(flag)break;
        }
        return arr;
    }
}
