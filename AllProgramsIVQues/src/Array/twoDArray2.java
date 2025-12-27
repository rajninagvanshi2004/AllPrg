// Q.2 – Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.
package Array;
import java.util.*;
public class twoDArray2 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the row no. :");
        int row = sc.nextInt() ;
        System.out.println("enter the col no. :");
        int col = sc.nextInt();
        int [][] number= new int [row][col];
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                number[i][j] = sc.nextInt();
            }
        }
        System.out.println(" enter the no x : ");
        int x = sc.nextInt();
        for (int i=0; i<row; i++)
        {
            for (int j=0; j<col;j++)
            {
                if (number[i][j]==x)
                {
                    System.out.println("x found at location ( " + i + " ," + j + ")");
                }
            }

        }
    }

}
