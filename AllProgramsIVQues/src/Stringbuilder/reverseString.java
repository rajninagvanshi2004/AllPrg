package Stringbuilder;

// reverse the String using reverse function.

/*public class reverseString {
    public static void main(String[] args) {
        String original="rajni";
        StringBuilder sb=new StringBuilder(original);
        System.out.println(sb.reverse());
    }
}*/

// using loop

/*public class reverseString {
    public static void main(String[] args) {
        String original="rajni";
        StringBuilder sb=new StringBuilder(original);
        String reve ="";
        for(int i=sb.length()-1; i>=0; i--)
        {
            reve=reve+sb.charAt(i);
        }
             System.out.println(reve);
    }
}*/

public class reverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Rajni");
        for(int i=0; i< sb.length()/2; i++)
        {
            int front = i;
            int back = sb.length()-i-1;

            char frontchar =sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }
        System.out.println(sb);
    }
}
