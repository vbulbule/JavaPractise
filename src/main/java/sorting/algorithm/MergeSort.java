package sorting.algorithm;

import java.util.Arrays;

public class MergeSort {

    //merge sort is based on devide and conquer
    public static void conquer(int[] arr, int si, int mid, int ei ){

        int[] merged = new int [ei - si + 1];

        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while(idx1<= mid && idx2<=ei){
           if(arr[idx1] <= arr[idx2]){
               merged[x]= arr[idx1];
               x++;idx1++;

           }
           else{
               merged[x]=arr[idx2];
               x++;idx2++;
           }
        }

        while (idx1<=mid){
            merged[x]= arr[idx1];
            x++;idx1++;
        }
        while (idx2<=ei){
            merged[x]=arr[idx2];
            x++;idx2++;
        }

        for(int i =0, j=si ;i<merged.length;i++, j++){
            arr[j] = merged[i];
        }

    }

    public static void divide(int arr[], int si, int ei){

        if(si >= ei)
            return;

        /*
        we can write belo statememt like si + ei/2
        but if we write this then there is chance if si and ei values are bigger then it may cross the integer limit
         */
        int mid = si + (ei-si)/2;

        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid,ei);


    }
    public static void main(String[] args) {
        int arr[] ={6, 3, 9, 5, 2, 8};
        System.out.println(Arrays.toString(arr));
        divide(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
