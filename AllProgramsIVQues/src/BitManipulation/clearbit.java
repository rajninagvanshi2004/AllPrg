package BitManipulation;

public class clearbit {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        int newnumber = ~(bitmask);
        int setbit = newnumber & n;
        System.out.println(setbit);

    }
}
