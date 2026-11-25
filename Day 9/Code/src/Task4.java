class EmplooyeeTask4{
    private int empId=1;
    public String empName="Gojo";
    protected int salary=99000;
    String stack="Backend";

    public int getEmpId() {
        return empId;
    }
}
public class Task4 {
    public static void main(String[] args) {
        EmplooyeeTask4 emp=new EmplooyeeTask4();
        System.out.println(emp.empName);
        System.out.println(emp.salary);
        System.out.println(emp.stack);
        System.out.println(emp.getEmpId());
    }
}
