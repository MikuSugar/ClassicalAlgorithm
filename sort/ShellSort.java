package sort;

import java.util.Arrays;

/**
 * 希尔排序
 * author:fangjie
 * time:2019/11/5
 */
public class ShellSort implements MyArraySort{
    @Override
    public int[] sort(int[] src) {
        int[] arr=Arrays.copyOf(src,src.length);
        int gap=1;
        while (gap<arr.length/3)gap=gap*3+1;
        while (gap>0)
        {
            for (int i=gap;i<arr.length;i++)
            {
                int temp=arr[i];
                int j=i-gap;
                while (j>=0&&arr[j]>temp)
                {
                    arr[j+gap]=arr[j];
                    j-=gap;
                }
                arr[j+gap]=temp;
            }
            gap=(int) Math.floor(gap/3);
        }
        return arr;
    }
}
