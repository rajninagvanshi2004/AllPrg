package function;

import java.util.Scanner;

public class factorial {
    public static void factorialCalculate(int a){
        int fact=1;
        for(int i=1; i<=a; i++)
        {
            fact=fact*i; //return fact;
        }
        System.out.println("factorial " +a +" = " + fact);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the no. :  ");
        int a =sc.nextInt();

        factorialCalculate(a);
    }
}
