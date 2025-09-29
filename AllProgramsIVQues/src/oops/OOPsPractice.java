package oops;

public class OOPsPractice {
    public static void main(String[] args) {
        OOPsPractice op=new OOPsPractice();
        Employee e=op.getEmp("madhu","123");
        System.out.println(e.name+"\t"+e.empId);

    }
    public  Employee getEmp(String name,String empid){
        Employee e=new Employee();
        e.name=name;
        e.empId=empid;
        return e;
    }
}
