package iraexam1;

import java.util.Arrays;

public class SumTraingleFromArray {

    public static void printSumArray(int[] a){

        int d[][] = new int[a.length][a.length] ;

        for(int i =0;i<a.length;i++){

            d[a.length-1][i]=a[i];

        }

        for(int i=a.length-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                d[i][j]=d[i+1][j]+d[i+1][j+1];
            }
        }

        for(int i=0;i<a.length;i++){

            System.out.println(Arrays.toString(d[i]));
        }






    }

    public static void main(String[] args) {
        int array[] ={1, 2, 3, 4, 5};
        printSumTriangle(array);

        int a = 15;
        int b = 20;
        int c = 10;
        int res = a > b ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println(res);


        System.out.print(1/2);
        System.out.print(" ,");
        System.out.print(1.0/2);
        System.out.print(", ");
        System.out.print(1/2.0);


    }

    public static void printTrangleSum(int[] A){

        for(int i = A.length-1;i >=0;i--){

            int arr[] = new int[i];

            for(int j = 0;j<i;j++){
                arr[j]= A[j]+A[j+1];
            }
            System.out.println(Arrays.toString(arr));

        }

    }

    public static void printSumTriangle(int[] a){

        int[] secondlast = new int[a.length-1];
        int[] thirdLast = new int [secondlast.length-1];
        int[] fourthLast = new int[thirdLast.length-1];
        int[] fifthLast = new int[fourthLast.length-1];

        for(int i=0;i<secondlast.length;i++){
            secondlast[i]= a[i]+a[i+1];
        }

        for(int i=0;i<thirdLast.length;i++){
            thirdLast[i]=secondlast[i]+secondlast[i+1];
        }

        for(int i=0;i<fourthLast.length;i++){
            fourthLast[i]=thirdLast[i]+thirdLast[i+1];
        }

        for(int i=0;i<fifthLast.length;i++){
            fifthLast[i]=fourthLast[i]+fourthLast[i+1];
        }


        System.out.println(Arrays.toString(fifthLast));
        System.out.println(Arrays.toString(fourthLast));
        System.out.println(Arrays.toString(thirdLast));
        System.out.println(Arrays.toString(secondlast));
        System.out.println(Arrays.toString(a));

    }
}
