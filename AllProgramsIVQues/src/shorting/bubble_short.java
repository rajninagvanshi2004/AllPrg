package shorting;
import java.util.Arrays;
import org.w3c.dom.ls.LSOutput;

public class bubble_short {
    public static void main(String[] args) {
    int arr[] = {7,8,3,1,2};
    int j;
    for(int i=0; i< arr.length-1; i++)
    {
        for ( j=0; j<arr.length-i-1; j++ )
        {
            if (arr[j]  >arr[j+1]) {            // swap
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
        System.out.println(Arrays.toString(arr));
    }
}
