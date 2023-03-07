package oops.inheritance;

public class CountObjects
{
    /*

    print the count of objects created

     */
    static int  counter; // nonstatic

    CountObjects(){

        counter++;
    }
    public static void main(String[] args) {
        CountObjects o1 = new CountObjects();
        CountObjects o2 = new CountObjects();
        CountObjects o3 = new CountObjects();
        CountObjects o4 = new CountObjects();
        CountObjects o5 = new CountObjects();

        System.out.println(counter);
    }
}
