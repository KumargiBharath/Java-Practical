class EmplooyeeTask1{
    private int empId;
    private String empName;
    private int salary;

    public int getEmpId() {
        return empId;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
public class Task1 {
    public static void main(String[] args) {
        EmplooyeeTask1 emp1=new EmplooyeeTask1();
        emp1.setEmpId(167);
        emp1.setEmpName("Rahul");
        emp1.setSalary(40000);
        System.out.println(emp1.getEmpId());
        System.out.println(emp1.getEmpName());
        System.out.println(emp1.getSalary());
        EmplooyeeTask1 emp2=new EmplooyeeTask1();
        emp2.setEmpId(5677);
        emp2.setEmpName("Harry");
        emp2.setSalary(70000);
        System.out.println(emp2.getEmpId());
        System.out.println(emp2.getEmpName());
        System.out.println(emp2.getSalary());
    }
}
