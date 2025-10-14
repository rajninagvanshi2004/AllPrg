package loops;
import java.util.*;
public class even_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int even
        int i;
        for (i=1; i<=n; i++)
        {
            even = int (i%2==0);
            System.out.println(even);
        }
    }
}
