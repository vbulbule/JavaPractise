package sessions;

import java.util.Scanner;

public class WhileLoop {
    
    public static void main(String[] args) {
        
        //syntax
        /*while(condition) // condition alwasys true
        {

        }*/

        //int i = 20;
    
        // if we didnt incermet the I value then the while lopp is goining into infinite loop
        /*while(i>=1){
            System.out.println(i);
            i--;
        }*/

        int i = 20;

       // 1. i++ <= 20 // true  i = 21
        //2. i++ <= 20// false i = 22

       /*  while(i++<=20);
        {
            System.out.println(i++);
        }*/


        /*char ch = 'i' ;
        while(ch != 'y'){
            System.out.println(ch);
        }*/

        Scanner sc = new Scanner(System.in);

        String ans = "no";

        while(!ans.equals("yes")){
            System.out.println("WILL You be going to listen ??");
            ans=sc.nextLine();
        }

    }
}
