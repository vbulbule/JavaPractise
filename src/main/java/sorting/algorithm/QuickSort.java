package sorting.algorithm;

import java.util.Arrays;

public class QuickSort {

    private static void swap(int[] arr, int p1, int p2){

        int temp = arr[p1];
        arr[p1]= arr[p2];
        arr[p2]=temp;

    }

    private static void quickSort(int[] arr, int low, int high){

        if(low >= high){
            return;
        }

        int pp= pivot(arr, low , high);
        quickSort(arr, low, pp-1);
        quickSort(arr, pp+1, high);
    }

    private static int pivot(int[] arr, int low, int high) {
        int p = arr[high]; // pivot is the value of last

        int curr = low;
        for(int i = low;i<high;i++){
            if(arr[i]<p){
                // swap  arr[current] and arr[i]
                swap(arr, curr, i);
                curr++;
            }
        }
        //get the pivot to its correct position

        swap(arr, curr,high);
        return curr;
    }

    public static void main(String[] args) {
        int arr[] = {4, 1, 8, 9, 3, 8, 1, 5};

        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
