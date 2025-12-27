package Array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no. : " );
        int size= sc.nextInt();
        int number[]=new int [size];
        int i;
        for (i=0; i<size; i++)
        {
            number[i]=sc.nextInt();
        }
        for (i=0; i<size; i++) {
            if (number[i] == 30) {
                System.out.println(i);
            }
        }
    }
}
