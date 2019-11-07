package sort;

/**
 * author:fangjie
 * time:2019/11/5
 */
public interface MyArraySort {
    int[] sort(int[] src);

    default void swap(int i, int j, int[] arr)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
