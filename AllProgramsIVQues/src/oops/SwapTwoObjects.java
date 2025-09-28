package oops;

public class SwapTwoObjects {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.name="Rajni";
        emp.empId="32890";
        System.out.println("emp.Name: "+emp.name+"\t EmpId:"+emp.empId);
        Employee emp1=new Employee();
        emp1.name="Shruti";
        emp1.empId="32891";
        System.out.println("emp1.Name: "+emp1.name+"\t EmpId:"+emp1.empId);
        Employee tempEmp;
        tempEmp=emp1;
        emp1=emp;
        emp=tempEmp;
        System.out.println("emp.Name: "+emp.name+"\t EmpId:"+emp.empId);
        System.out.println("emp1.Name: "+emp1.name+"\t EmpId:"+emp1.empId);
    }
}
