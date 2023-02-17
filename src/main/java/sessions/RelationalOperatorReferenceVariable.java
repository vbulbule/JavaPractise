package sessions;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class RelationalOperatorReferenceVariable {
    
    public static void main(String[] args) {
        // Car c1 = new Car();

        RelationalOperatorReferenceVariable r1 = new RelationalOperatorReferenceVariable();
        System.out.println(r1);

        RelationalOperatorReferenceVariable r2 = new RelationalOperatorReferenceVariable();
        System.out.println(r2);

        System.out.println(r1 == r2);
        System.out.println(r1 != r2);

        //System.out.println(r1 > r2);// we cant do it in reference variable as we are comparing with address

        r1 = r2;
        System.out.println(r1==r2);

        r1 = null;
        r2 = null;

        System.out.println(r1==r2);
    }
}
