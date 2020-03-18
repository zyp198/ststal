package DataStructuresAndAlgorithms;

import java.util.Arrays;

/**
 * @author Zhangyp
 * @version 1.0
 * @date 2020-3-18 上午 9:45
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,1,2,3,14,26,1,7,4,9,2};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] quicksort(int[] arr, int left , int right){
        int temp;
        int key = arr[left];
        int i=left;
        int j=right;
        while (i<j) {
            //从右向左扫描,当arr[right]<key退出循环
            while (arr[j]>key&&i<j){
                j--;
            }
            //从左向右循环，当arr[left]>key 退出循环
            while (arr[i]<key&&i<j) {
                i++;
            }
            //swap left and right
            if (i<=j){
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        if (i-1>left) {
            quicksort(arr,left,i-1);
        }
        if (i+1<right){
            quicksort(arr,j+1,right);
        }
        return arr;

    }
}
