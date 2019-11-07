package sort;

import java.util.Arrays;

/**
 * 计数排序
 *
 * 只适用于一定范围的正整数
 * author:fangjie
 * time:2019/11/7
 */
public class CountingSort implements MyArraySort{

    @Override
    public int[] sort(int[] src) {
        int[] arr=Arrays.copyOf(src,src.length);
        int max=src[0];
        for (int a:arr)max=Math.max(max,a);
        int[] book=new int[max+1];
        for (int a:arr)book[a]++;

        int idx=0;
        for (int i=0;i<book.length;i++)
        {
            for (int k=0;k<book[i];k++)
            {
                arr[idx++]=i;
            }
        }
        return arr;
    }
}

/*

 */
