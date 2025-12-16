package String;
import java.util.Scanner;
/*
1st way of replace the string;
public class problems {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a new string : ");
        String original=sc.next();
        System.out.println(original);
        String result = original.replace('e','i');
        System.out.println(result);
    }
}
*/
//2ed way of replace the string
public class problems {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String size=sc.next();
        String array = new String(size);
        String result= "";
        for(int i=0;i<array.length();i++)
        {
           if(array.charAt(i)== 'e') {
               result += 'i';
           } else {
               result +=array.charAt(i); }
        }
        System.out.println(result);
        }

    }



/*//  3rd way of replace the string
public class problems {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String result= "";
        for (int i=0;i<str.length(); i++) {
            if (str.charAt(i) == 'e')
            {
            result += 'i';
        }
        else {
           result +=str.charAt(i); }
        }
        System.out.println(result);
    }
}*/
