package datatypes;

public class DataTypeTesting2 {
    public static void main(String args[]){
        System.out.println("hello world");

        int a = 15;
        int b = 15;

        // Using unary operators
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));
        int f=7;
        System.out.println("f &= 0b1010: " + (f |= 0b1100));
        int i=1,j=2,k=3;
        k= ++i + j++ + ++k - ++j;
        System.out.println("K="+k);


    }
}
