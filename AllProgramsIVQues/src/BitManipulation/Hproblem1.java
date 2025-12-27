package BitManipulation;

import java.util.Scanner;
public class Hproblem1 {
    public static void main(String[] args) {
        int num=10;
        if (num /2 == 1){
            int num = num / 2;
            int mod = num % 2;
        }
        System.out.println("mod");

    }
}





/*//write a program to find if a number is a power of 2 or not.
public class Hproblem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        int num = sc.nextInt();
        if((num & (num-1) ) == 0){
            System.out.println("the given number is  power of 2");
        }else {
            System.out.println("the given number is not a power of 2");
        }

    }
}*/
