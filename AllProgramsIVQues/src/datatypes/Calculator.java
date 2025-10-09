package datatypes;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter the a =");
        int a= obj1.nextInt();
        System.out.println("Enter the b =");
        int b= obj1.nextInt();

        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int division = a/b;
        int mod = a%b;
        System.out.println("addition : "+ add);
        System.out.println("subtract : "+ sub);
        System.out.println("multiplication : "+ mul);
        System.out.println("division : "+ division);
        System.out.println("modules : "+ mod);

    }

}
