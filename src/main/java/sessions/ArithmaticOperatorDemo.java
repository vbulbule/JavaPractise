package sessions;

import java.net.Socket;

public class ArithmaticOperatorDemo {
    
    public static void main(String[] args) {
        int i,j,k;
        i=30;
        j=20;
        k=i+j;
        System.out.println(k);
        //sum of i and j = 50
        System.out.println("Sum of i and J = " +k);
        k=i-j;
        System.out.println(k);
        System.out.println("Diff of i and j = "+k);
        k= i*j;
        System.out.println(k);
        k= i/j;
        System.out.println("Ouetient of i/j ="+k);
        k = i%j;
        System.out.println("Reminder or mod of i/j = "+k);

        double d = i/j;
        System.out.println(d);

        d = 30.0/20.0;
        System.out.println(d);

        d = 30/20.0;
        System.out.println(d);

        d = 30.0/20;
        System.out.println(d);

        //int < double 
       // k = 30.0/20; type miss match error we cannot assign double value to integer

       System.out.println("");
       //System.out.println(''); cannot print blanck caharacter
       System.out.println(" ");
       System.out.println('A'+'B'+"Hello");
       System.out.println("Hello \nVitthal");
       System.out.println(10+"\n"+20+"\n"+30);
       System.out.println(10+'\n'+20+'\n'+30);
       System.out.println('A'+"B");
       System.out.println('k');
       char ch = 78;
       System.out.println(ch);
       System.out.println('A'+"B");

       System.out.println('A'+ "\n" ); //\n if u want to print in new line 
       System.out.println('A' + 20);
       //char + char = addition
       //chanr + no = addtion
       //no + char = addition

       // char + string = concanate
       //string + no = conconate
       //string + char = conconate
       // no + string  = conconate

       



    }
}
