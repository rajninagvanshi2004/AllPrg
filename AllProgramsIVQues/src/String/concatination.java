package String;

import java.util.Scanner;

public class Second_program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name: ");
        String name= sc.nextLine();              //if we can enter more than one word then use then use sc.nextLine();
        System.out.println(name);

        System.out.println("Enter the first name: ");
        String firstName =sc.next();
        // if we can enter only one world then i can use sc.next();
        System.out.println("enter the lastname : ");
        String LastName =sc.next();

        System.out.println(firstName);
        System.out.println( LastName);
        String  fullname = firstName + " " + LastName;
        System.out.println(fullname);


    }
}
