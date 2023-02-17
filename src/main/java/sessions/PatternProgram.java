package sessions;

public class PatternProgram {
    
    public static void main(String[] args) {
        
       /*  for(int i = 10; i<= 100;i +=10){
            System.out.println(i);
        }*/


        /*
        int i 0 -> j 0 1 2
        int i 1 -> j 0 1 2
        int i 2 -> j 0 1 2
        */

        int counter = 10;
        for(int i = 0;i <=2;i++){
            for(int j = 0;j<=2;j++){
                System.out.print(counter + "  ");
                counter= counter+10;
            }
            System.out.println();
        }


        //

        /*1    
         1
          1
           1
            1   
         */
        System.out.println("-- print pattern dignolly ---");
        for(int i = 0;i <=4;i++){    

            for(int j = 0;j<=4;j++){
                if(i==j){
                    System.out.print(1);
                }
                else
                System.out.print(" ");
                
            }
            System.out.println();
        }





    }
}
