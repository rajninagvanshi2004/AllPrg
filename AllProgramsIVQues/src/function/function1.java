package function;

import java.util.Scanner;

public class function1 {
    public static int calculateSum(int a, int b){
        int sum = a+b;
        System.out.println("sum= " +sum);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("a=");
        int a= sc.nextInt();
        System.out.println("b=");
        int b= sc.nextInt();
        calculateSum(a,b);

    }
}
