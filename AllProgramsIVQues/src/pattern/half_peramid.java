package pattern;
//public class half_peramid {
    //public static void main(String[] args) {
      //  for(int i=1;i<=4;i++)
        //{
          //  for(int j=1;j<=i;j++) {
            //    System.out.print("*");
            //}
           // System.out.println();
       // }

   // }
//      * * * *
//      * * *
//      * *
//      *
//}
//second code
//   public class half_peramid {
//       public static void main(String[] args) {
//           for(int i=4;i>=1;i--)
//           {
//               for(int j=1;j<=i;j++)
//               {
//                   System.out.print("*");
//               }
//                  System.out.println();
//           }
//       }
//   }

// third code
//           *
//        *  *
//     *  *  *
//  *  *  *  *
//public class half_peramid {
//    public static void main(String[] args) {
//        int n=4;
//        for(int i=1; i<=n; i++)
//        {
//            for(int j=1; j<=n-i; j++)
//          {
//                System.out.print(" ");
//            }
//            for (int k=1; k<=i; k++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//}
//}

//    1
//    1   2
//    1   2   3
//    1   2   3  4
//    1   2   3   4  5
public class half_peramid {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

