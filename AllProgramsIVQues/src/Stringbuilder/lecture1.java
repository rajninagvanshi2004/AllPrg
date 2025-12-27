package Stringbuilder;

public class lecture1 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'p');
        System.out.println(sb);
        //insert new chracter
        sb.insert(2,'n');
        System.out.println(sb);
        //delete character
        sb.delete(2,3);
        System.out.println(sb);
    }
}
