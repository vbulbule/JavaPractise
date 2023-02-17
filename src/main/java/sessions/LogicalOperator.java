package sessions;

public class LogicalOperator {

    public static void main(String[] args) {
        int x = 7, y = 5;
        System.out.println(x & y);// bitwise
       // 0111 : 7
       // 0101 : 5
       // 0101 : 5 : AND bitwise
       // 0111 : 7 OR bitwise

       System.out.println(x | y);
       System.out.println(x ^ y); // ^ = XOR

       // boolean && / || boolean
       System.out.println(x==y && x>y); //false
       System.out.println(x>y || x<y);
    }
    
}
