package oops.encapsulation;

public class Demo {

    private int i = 100;
    private String name = "Vitthal";
    public void print(){
        System.out.println("i : "+ i);
        System.out.println("Name : "+name);
    }
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.print();
        d1.name="amruta";
        d1.i=400;
        d1.print();
    }

    int getI(){
        return i;
    }

    void setI(int i){
        this.i = i;
    }

    String getName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }




}
