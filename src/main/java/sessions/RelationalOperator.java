package sessions;

public class RelationalOperator {
    public static void main(String[] args) {
        int x = 10, y=15;

        boolean mangu = x==y;
        System.out.println(mangu);
        System.out.println(x==y);
        System.out.println(x==10);
        System.out.println(13==12);
        System.out.println(true);
        System.out.println(x!=y);

        mangu= x>y;
        System.out.println(mangu);
        mangu = x<y;
        System.out.println(mangu);
        System.out.println(x);
        System.out.println(x==13);

        System.out.println(x>=y);
        System.out.println(x<=y);


    }
}
