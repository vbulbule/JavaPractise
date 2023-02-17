package sessions;

public class ForLoop {
    
    public static void main(String[] args) {
        
        //syntax : 
        //for (inilization ; conditon ; update){

        //}

      
        /*for (int i = 1 ; i <= 10 ; i++){
            System.out.println("value of i =" + i);
            System.out.println("i am vitthal");
            System.out.println("-------------------------------");
        }*/


        /*for (int i=1,j=1; i<=20 && j<20 ; i++,j++){
            System.out.println(i);
            System.out.println(j);
        }*/

        // it will go in infinite loop
        /*int i = 1;
        for( ; ;){

            System.out.println(i);
        }*/

        /*int i;
        for( i =1; i<=20 ; ++i){
            System.out.println(i);
        }*/

       /*  int i=1;
        for( ;true; ){
            System.out.println(i);
        }*/

        //compile time error (unrechable code)
        /*int i=1;
        for( ;false; ){
            System.out.println(i);
        }*/

        /*boolean bln = false;
        for( ; bln == false ;){
            System.out.println("i am vitthal");
        }*/


        //i+=1 => i = i+1 
        for(int i= 1; i <= 10 ; i+=2){
            System.out.println(i);
        }



    }
}
