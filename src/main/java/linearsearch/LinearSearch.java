package linearsearch;

public class LinearSearch {

    public static int linearSearch(int[] arr, int key){
        for(int i =0;i <arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr ={ 4, 1, 8, 9, 3, 10, 1, 5};

        int idx;

        idx = linearSearch(arr, 10);
        int idx2=linearSearch(arr, 13);
        System.out.println(idx);
        System.out.println(idx2);

    }


}
