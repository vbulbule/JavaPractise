package sessions;

public class AssignmentOperator {
    
    public static void main(String[] args) {
        int i =10, j = 20, k= 30, l= 40, m = 50; // if we want to declare multiple variable in same line we can decalre that using comma seperated value
        
        i += 67;//i = i+67
        System.out.println(i);
        j *= 3; // j = j * 3
        System.out.println(j);
        k -= 40;
        System.out.println(k);
        l %= 5; // l = l % 5;
        System.out.println(l);

        int a = 4;
        //System.out.println(a*=5); // a = a * 5
        
        //System.out.println(a *= 5+4;); // a = a * 5 + 4 // a = a * 9 
        // right side first then assignment caompound

        System.out.println(a= (a*5)+4);

        a=4;
        a *= 2+5*4;
        System.out.println(a);


    }
}
