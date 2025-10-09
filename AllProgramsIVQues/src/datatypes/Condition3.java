package datatypes;

import java.util.Scanner;

public class Condition3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.println("janvery");
                break;
            case 2:
                System.out.println("febvery");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("augst");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("Octuber");
                break;
            case 11:
                System.out.println("Novmber");
                break;
            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Invalid Month");

        }
    }
}

