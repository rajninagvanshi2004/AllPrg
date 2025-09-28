package oops;

public class OOPsPractice {
    public static void main(String[] args) {
        Employee e=getEmp("madhu","123");
        System.out.println(e.name+"\t"+e.empId);

    }
    public static Employee getEmp(String name,String empid){
        Employee e=new Employee();
        e.name=name;
        e.empId=empid;
        return e;
    }
}
