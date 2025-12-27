package BitManipulation;

public class SetBit {

    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int BitMask = 1<<pos;
        int newnumber=BitMask | n;
        System.out.println(newnumber);
    }
}
