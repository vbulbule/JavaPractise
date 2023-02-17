package sessions;

public class SwitchCase {

    
    public static void main(String[] args) {
        
        int i = 5;

        switch (i) //expresionn/ variable
        {
            case 1 : System.out.println("1");
                     break;
            case 2 : System.out.println("2");
                     break;
                     
            default : System.out.println("invalid");

        }


        boolean bln=isAmrutaInocant();
        System.out.println(bln);


    }


    public static boolean isAmrutaInocant(){
        boolean bln = false;
        return bln;
    }

    
}
