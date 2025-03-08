package Org.str.javabasics;

public class Constructor {

    int a;
    int b;

    public Constructor() {
        System.out.println("Default Constructor");
    }

    public Constructor(int a) {
        System.out.println("parameterised Constructor");
    }
    public Constructor(int a, int b) {
        this.a= a;
        this.b= b;
        System.out.println(a);
        System.out.println(b);
    }


    public static void main(String[] args) {
        Constructor c=new Constructor();
        System.out.println(c);
        System.out.println(c.hashCode());
        Constructor c1=new Constructor(10);
        System.out.println(c1);
        Constructor c2=new Constructor(10,20);


    }
}
