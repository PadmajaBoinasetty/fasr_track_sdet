package Org.programmes;

public class ReverseNumber {
    public static void main(String[] args) {
        int n=12345;
        System.out.println("Original Number is: "+n);
        int reverse = 0;
        while(n!=0){
            int lastDigit=n%10;
            reverse = (reverse*10)+lastDigit;
            n= n/10;
        }
        System.out.println("Reverse of a number is: "+reverse);

    }
}
