package sessions;


public class InstanceOfOperator {
    
    public static void main(String[] args) {
        
        InstanceOfOperator i1 = new InstanceOfOperator();
        System.out.println(i1);
        System.out.println(i1 instanceof InstanceOfOperator);
        i1 = null;// before assigning to null it is pointing on sone location with is address of InstanceofOperatorType
        // i1 = null now it is pointing to null value

        System.out.println(i1);
        System.out.println(i1 instanceof InstanceOfOperator);

        //String s = "Vitthal";
        String s2 = new String("Vitthal");

        System.out.println(s2 instanceof String);
        s2= null;
        System.out.println(!(s2 instanceof String));

        Orange o1 = new Orange();
        System.out.println(o1 instanceof Orange);
        o1= null;
        System.out.println(o1 instanceof Orange);

    }
}
