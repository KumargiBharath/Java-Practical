class Salary{
    private int salary;

    public void setSalary(int salary) {
        if(salary>0) {
            this.salary = salary;
        }else{
            System.out.println("Error");
        }
    }

    public int getSalary() {
        return salary;
    }
}
public class Task3 {
    public static void main(String[] args) {
        Salary call=new Salary();
        call.setSalary(-10000);
        System.out.println(call.getSalary());
    }
}
