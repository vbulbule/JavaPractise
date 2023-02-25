package sorting.algorithm;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int arr[] ={15, 16, 6, 8, 5};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr){

        int n = arr.length;

        for(int i=0;i<n-1;i++){
            /*
            Using n-1-i for optimization of code where we dont need necessary comparision for computition
             */
            for(int j= 0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

}
