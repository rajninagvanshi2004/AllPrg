package datatypes;
import java.util.*;
public class Condition1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(a>b){
            System.out.println("a is gretest num ");
        } else if (a==b) {
            System.out.println("num is eqal");
        }
        else {
            System.out.println("a is smallest num");
        }
    }
}
