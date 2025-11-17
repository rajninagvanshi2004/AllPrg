package loops;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no : ");
        int user= sc.nextInt();
        if (user == 1){
            System.out.println("Enter marks :");
            int marks = sc.nextInt();
            if (marks >= 90){
                System.out.println("this is Good");
            } else if (marks >= 60 && marks <=89) {
                System.out.println("this is also good");
            }
            else {
                System.out.println("This is good as well");

            }
        }
        else{
            System.out.println("stop the code");
        }
    }
}
