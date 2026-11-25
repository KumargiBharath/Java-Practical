public class Task2{
    public static void main(String[] args) {
        Task1Employee rahul=new Task1Employee();
        rahul.employeeId=11;
        rahul.employeeName="Rahul";
        rahul.employeeEmail="Rahul@gamil.com";
        rahul.salary=20000;

        Task1Employee priya=new Task1Employee();
        priya.employeeId=12;
        priya.employeeName="Priya";
        priya.employeeEmail="Priya@gamil.com";
        priya.salary=40000;
    }
}
class Task2Employee {
    int employeeId;
    String employeeName;
    String employeeEmail;
    int salary;
}
