package datatypes;

public class DataTypesTesting1 {
    public static void main(String args[]){

        short s=258;
        System.out.println("Short="+s);
        byte b= (byte) s;
        System.out.println("Byte="+b);

        float f=20.5f;

        int i= (int) f;
        System.out.println("Int="+i);

        //b=(byte) 32667; //output: -101
        //b=(byte)232;    //output: -24
        //b=(byte) 65767; //output: -25
        b=(byte) 64764;
        System.out.println("Byte="+b);
        byte bt=0;
        System.out.println("Byte="+bt);
    }
}
