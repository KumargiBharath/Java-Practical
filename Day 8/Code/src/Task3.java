public class Task3 {
    Task3Employee rahul=new Task3Employee(11,"Rahul","Rahul@email.com",20000);
    Task3Employee harry=new Task3Employee(12,"harry","harry@email.com",40000);

}
class Task3Employee {
    int employeeId;
    String employeeName;
    String employeeEmail;
    int salary;

    Task3Employee(int id,String name,String email,int salary){
        this.employeeId=id;
        this.employeeName=name;
        this.employeeEmail=email;
        this.salary=salary;
    }
}