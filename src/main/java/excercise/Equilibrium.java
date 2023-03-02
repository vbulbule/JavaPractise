package excercise;


/*
1. Given an array of n elements, how do you print the frequencies of  elements without using extra space.
Assume all elements are positive,  editable and less than n.

2. The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to
the sum of elements at higher indexes.

3. Given an array of n positive numbers. All numbers occur an even number of times except 1 which occurs
an odd number of times. Find that number in O(n) time and O(1) space.

4. Find the Rotation Count in Rotated Sorted array
Consider an array of distinct numbers sorted in increasing order. The array
has been rotated (clockwise) k number of times. Given such an array, find the value of k.
 */
public class Equilibrium {

    private static int getEquilibriumIndex(int[] arr){

        int mid = 0 + (arr.length-0) /2;

        // calculate lsum, rsum
        int lSum=0, rSum=0;
        for(int i =0; i<mid; i++){
            lSum += arr[i];
        }

        for(int i =mid+1 ;i<arr.length; i++){
            rSum += arr[i];
        }
        if(lSum==rSum)
            return mid;

        if(lSum > rSum && mid > 0){
            while (lSum>rSum && mid>0 ){
                lSum = lSum-arr[mid-1];
                rSum = rSum+arr[mid];
                mid --;
            }
        }
        else{
            while (rSum>lSum && mid < arr.length-1){
                lSum = lSum + arr[mid];
                rSum = rSum - arr[mid+1];
                mid++;
            }
        }

        if(lSum == rSum){
            return mid;
        }


        return -1;
    }

    public static void main(String[] args) {
        int arr[] ={50, 10, 65, 5, 15, 20, 30, 25, 35};
        System.out.println(getEquilibriumIndex(arr));
    }
}
