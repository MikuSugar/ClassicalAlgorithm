package sort;

import java.util.Arrays;

/**
 * 测试类
 * author:fangjie
 * time:2019/11/5
 */
public class Test {
    public static void main(String[] args) {
        int[] arr={5,8,1,5,8,7,6,6,1,0,99,10};
        MyArraySort sort=new BucketSort();
        System.out.println(Arrays.toString(sort.sort(arr)));
    }
}
