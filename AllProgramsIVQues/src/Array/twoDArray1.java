package Array;

import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the rows: ");
        int row=sc.nextInt();
        System.out.println("enter the colum: ");
        int coloum = sc.nextInt();
        int [][] number=new int[row][coloum];
        for(int i=0; i<row; i++)
        {
            for (int j=0; j<coloum; j++)
            {
                number[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i<row; i++)
        {
            for (int j=0; j<coloum; j++)
            {
                System.out.print(number[i][j] +" ");
            }
            System.out.println();
        }



    }
}
