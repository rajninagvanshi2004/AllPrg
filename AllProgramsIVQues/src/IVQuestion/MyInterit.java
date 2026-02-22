package IVQuestion;

import IVQuestion.base.A;
import IVQuestion.derived.B;
import IVQuestion.derived.C;

public class MyInterit {
    public static void main(String[] args) {
        A a1=new A();
//        a1.show();

        A a2=new B();
//        a2.show();

        B b1=new B();
        b1.showA();

        B b2=new C();
        b2.show();

    }
}
