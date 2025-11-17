package pattern;

//public class no_pattern {
//    public static void main(String[] args) {
//    for (int i=5; i>=1; i--) {
//        for (int j = 1; j <= i; j++)
//        {
//            System.out.print(j+" ");
//        }
//        System.out.println();
//   }
//    }
//}

//FLOUD'S TRIANGLE
//public class no_pattern {
//    public static void main(String[] args) {
//        int n=1;
//        for(int i=1; i<=5; i++)
//        {
//            for (int j=1; j<=i; j++)
//            {
//                System.out.print(n+" ");
//                n++;
//            }
//            System.out.println(" ");
//        }
//    }
//}

public class no_pattern {
    public static void main(String[] args) {
        for(int i=1; i<=5;i++)
        {
            for(int j=1; j<=i;j++)
            {
                int sum=i+j;
                if (sum % 2==0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
}
