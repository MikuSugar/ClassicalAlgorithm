package sort;

import java.util.Arrays;

/**
 * author:fangjie
 * time:2019/11/7
 */
public class BucketSort implements MyArraySort{

    private MyArraySort myArraySort;

    public BucketSort(MyArraySort myArraySort) {
        this.myArraySort=myArraySort;
    }

    public BucketSort() {
        this.myArraySort=new QuickSort();
    }

    @Override
    public int[] sort(int[] src) {
        int[] arr=Arrays.copyOf(src,src.length);

        int min=arr[0];
        int max=arr[0];
        for (int a:arr)
        {
            max=Math.max(max,a);
            min=Math.min(min,a);
        }
        int bucketSize=arr.length/5+1;
        int len=(max-min)/bucketSize;
        int[] bucketLen=new int[bucketSize];
        int[][] buckets=new int[bucketSize][src.length];
        for (int[] b:buckets)Arrays.fill(b,Integer.MAX_VALUE);
        for (int a:arr)
        {
            int idx=(a-min)/len;
            idx=idx>=bucketSize?bucketSize-1:idx;
            buckets[idx][bucketLen[idx]++]=a;
        }

        int idx=0;
        for (int i=0;i<bucketSize;i++)
        {
            buckets[i]=myArraySort.sort(buckets[i]);
            for (int j=0;j<bucketLen[i];j++)arr[idx++]=buckets[i][j];
        }

        return arr;
    }
}
