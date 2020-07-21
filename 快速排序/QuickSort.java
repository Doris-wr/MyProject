package 快速排序;

import java.util.Arrays;

/**
 * @Author:wangrui
 * @Date:2020/7/19 8:04
 */
/*
 * 功能描述:快速排序
 * 时间复杂度：nlog2(n)    最坏是O(n^2)
 * 空间复杂度：log（n)            O(n）
 * 快排要快，那么每次划分排列的时候，如果都可以均匀的进行划分，那么效率最好。
 * 不稳定排序
 * @return
 */
public class QuickSort {
    public static void quick(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int par=patition(arr,left,right);
        quick(arr,left,par-1);
        quick(arr,par+1,right);
    }

    private static int patition(int[] arr, int low, int high) {
        int temp=arr[low];
        while(low<high){
            while(low<high&&arr[high]>=temp) {
                high--;
            }
            arr[low]=arr[high];
            while(low<high&&arr[low]<=temp){
                low++;
            }
            arr[high]=arr[low];
        }
        arr[low]=temp;
        return low;
    }

    public static void quickSort(int[] arr){
        quick(arr,0,arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr={8,9,5,2,6,4,1,0};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
