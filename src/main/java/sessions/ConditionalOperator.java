package sessions;

public class ConditionalOperator {
    
    public static void main(String[] args) {
        
        int x= 10;

        int y;

        y = x > 20 ? 100 : 200;
        System.out.println(y);

        char ch = x < 20 ? 'V' : 'B';
        System.out.println(ch);

        int marks = 24;

        //output : PASS or FAIL
        
        String result = marks<35 ? "FAIL"  : "PASS";
        System.out.println(result);
    }
}
