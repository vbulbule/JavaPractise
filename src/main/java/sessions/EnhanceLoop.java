package sessions;


public class EnhanceLoop {
    
    public static void main(String[] args) {
        

        //single or sclar entities
        String s = "Vitthal";

        int i = 10;
        

        //array

        //not of collection of a same data

        int [] k = {10, 20, 30, 40, 50};

        /*k =0 -> 10
        k =1 -> 20
        k =2 -> 30
        k =3 -> 40
        k =4 -> 50*/

        System.out.println(k[0]);
        System.out.println(k[1]);
        System.out.println(k[2]);
        System.out.println(k[3]);
        System.out.println(k[4]);

        System.out.println("\n-------------------------------------");
        System.out.println("--Printing using for loop--");
        for(int j =0;j<=4;j++){
            System.out.println(k[j]);
        }


        System.out.println("-------Using Enhance for loop --------");
        /*syntax : 
        for (var : collection/array){
            //body
        }*/

        for( int a : k ){
           System.out.println(a);
        }


        String name = "vitthal";

        String[] names = {"Vitthal", "Amruta", "Ketaki", "Pooja","Rahul"};

        for( String sq : names ){

            System.out.println(sq);
        }


        Orange o1 = new Orange();
        Orange o2 = new Orange();
        Orange o3 = new Orange();
        Orange o4 = new Orange();
        Orange o5 = new Orange();


        Orange[] oranges = {o1,o2,o3,o4,o5,o1,o2,o3,o4,o5,o1,o2,o3,o4,o5,o1,o2,o3,o4,o5,o1,o2,o3,o4,o5};

        for( Orange s1 : oranges) {
            System.out.println(s1);
        }


        System.out.println("Length of Orange Array : "+oranges.length);
        for(int l = 0; l < oranges.length ; l++){
            System.out.println(oranges[l]);
        }


        



    }
}
