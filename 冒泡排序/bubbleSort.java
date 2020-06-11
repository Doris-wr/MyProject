package 冒泡排序;

import java.util.Arrays;

/**
 * @Author:wangrui
 * @Date:2020/6/10 10:25
 */
public class bubbleSort {
    public static void sort(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j< a.length-i-1 ;j++){
                if(a[j]>a[j+1]){
                    int tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{6,3,7,2,9,1,5,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
