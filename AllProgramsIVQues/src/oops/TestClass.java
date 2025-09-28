package oops;

public class TestClass {
    public static void main(String[] args) {
        Employee e;
        e=new Employee();
        e.name="Mr Shruti";
        e.empId="3456";
        Employee e1;
        e1=e;
        System.out.println(e.name+"\t"+e1.name);
    }
}
