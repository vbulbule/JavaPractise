package sessions;

public class UnaryOperator {

    public static void main (String[] args){

    

        //int i = 9;
        //int j;
        //j = i++;// post increment
        // first iniliase then increment

        //j = ++i;// pre increment
      // first increse then initialise
      
        //System.out.println(j);
        //System.out.println(i);
      //  int i = 0, j =0;
       // j = i + i++ + i + i++;
       
       int i = 0,j=1;
       int k = i + j++ + ++i + ++j + i++;
            
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);


    }
    
}
