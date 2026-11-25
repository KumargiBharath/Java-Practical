public class Task4{
    public static void main(String[] args) {
        Task4Employee rahul=new Task4Employee();
        rahul.empId=11;
        rahul.empName="Rahul";
        rahul.empEmail="rahul@email.com";
        rahul.salary=40000;
        rahul.displayName();
    }
}
class Task4Employee{
    int empId;
    String empName;
    String empEmail;
    int salary;

    public void displayName(){
        System.out.println(empName);
    }
}