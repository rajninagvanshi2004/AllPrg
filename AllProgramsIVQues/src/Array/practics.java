package Array;

import java.util.Scanner;

public class practics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int size = sc.nextInt();

        int[] marks= new int [size];
        int i;
        for (i=0; i<size; i++)
        {
            marks[i]=sc.nextInt();
        }
       /* for(int j=0; j<size; i++)
        {
            System.out.println(marks[i]);
        }*/
        if(marks[i]==20)
        {
            System.out.println("indexed of that no " +i);
        }

    }
}
