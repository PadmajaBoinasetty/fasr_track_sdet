package Org.str.inheritance;

public class Tata extends Car {

    public static void main(String[] args) {
        Tata tata = new Tata();
        tata.engine();
        tata.fuel();
        int total=tata.a;
        System.out.println(total);
        String name=tata.name;
        System.out.println(name);

    }
}
