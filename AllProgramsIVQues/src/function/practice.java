package function;

import java.util.Scanner;

/*
public class practice {
    public static void calculateAverage(int a, int b, int c){
        int average = (a+b+c)/3;
        System.out.println("Average = " +average);
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  a = ");
        int a = sc.nextInt();
        System.out.println("enter the  b = ");
        int b = sc.nextInt();
        System.out.println("enter the  c = ");
        int c = sc.nextInt();
        calculateAverage(a,b,c);
    }
}
*/
public class practice {
    public static void sumOfOddNumber(int a){

        int sum=0;
        for(int i=1; i<=a; i++)
        {
            if (i%2==0)
            {
                return;
            }
            else
            {
                sum=sum+i;
            }
            System.out.println("sum =" + sum);
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        sumOfOddNumber(a);
    }

}





