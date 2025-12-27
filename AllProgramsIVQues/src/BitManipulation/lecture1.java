package BitManipulation;

public class lecture1 {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        System.out.println(bitMask);
        if ((bitMask & n)==0)
        {
            System.out.println("the 2ed position is 0 ");
        }
        else {
            System.out.println("the 2ed position is non- zero");
        }

    }
}
