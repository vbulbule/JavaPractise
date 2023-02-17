package sorting.algorithm;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {
        int[] val = { 4, 1, 7, 3, 10, 9};
        System.out.printf(Arrays.toString(selectionSort(val)));
    }


    public static int[] selectionSort(int[] array){

        for(int i =0;i<array.length;i++){
            int min_index = i;
            for(int j = i+1;j<array.length;j++){
                if(array[j]<array[min_index]){
                    min_index = j;
                }
            }
            int temp = array[min_index];
            array[min_index]= array[i];
            array[i]=temp;
        }

        return array;
    }
}
