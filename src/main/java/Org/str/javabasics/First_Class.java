package Org.str.javabasics;

public class First_Class {

    int a = 10;
    int b =30;
    static int c= 20;

    public static void main(String[] args) {
        System.out.println("first class");
        First_Class firstclass = new First_Class();
        firstclass.Login();
        Registration(); // directly we can call static methods inside a class
        int  z = firstclass.a;
        System.out.println(firstclass.a);
        System.out.println(z);
        System.out.println(c);// directly we can call static variables inside a class
        System.out.println(firstclass.id());
    }
    static{ // static  block
        System.out.println("static block");
    }
    public void Login(){
        System.out.println("Login successfully completed");
    }
    public static void Registration(){
        System.out.println("registration successfully completed");
    }

    public int id (){ // methods also contains values like variables
        return 10;
    }

}


