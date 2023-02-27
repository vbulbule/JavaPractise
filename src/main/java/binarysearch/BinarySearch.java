package binarysearch;

public class BinarySearch {
    private static int binarySearch (int[] arr, int key,  int low, int high){

        if(low > high){
            return -1;
        }

        int mid = low + (high-low)/2;

        if(arr[mid] == key)
            return mid;
        if(arr[mid] < key){
           return binarySearch(arr, key, mid+1, high);
        }
        if(arr[mid] > key){
           return binarySearch(arr, key, low, mid-1);
        }
       return -1;
    }

    public static void main(String[] args) {
        int arr[] ={1, 3, 4, 5, 8, 9, 10, 12};

        int idx = binarySearch(arr, 10, 0, arr.length-1);
        System.out.println(idx);

         idx = binarySearch(arr, 199, 0, arr.length-1);
        System.out.println(idx);
    }
}
