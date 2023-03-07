package problems;

public class SumOfArray {


    /*

     -- declare an array
     -- caculate the sum of entire arry and to store in some int variable
     -- print the sum
     */

    public static void main(String[] args) {
        int[] array = {4, 6, 1, 4, 7, 3, 9, 2, 9 ,10};
        int n = array.length;
        System.out.println(calculteSumOfArray(array, n));
    }

    public static int calculteSumOfArray (int[] array, int n){
        int sum=0;
        //Logic
        for(int i = 0; i<n;i++){
            sum = sum + array[i];
        }
        return sum;
    }


}
