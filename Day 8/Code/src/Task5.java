public class Task5 {
    public static void main(String[] args) {
        Task5Employee one=new Task5Employee();
        Task5Employee two=new Task5Employee(12,"Harry");
        Task5Employee three=new Task5Employee(34,"Harry,40000");
    }
}
class Task5Employee{
    int empId;
    String empName;
    int salary;
    Task5Employee(){
        System.out.println("Default Constructor");
    }
    Task5Employee(int id,String name){
        this.empId=id;
        this.empName=name;
        System.out.println("Constructor with 2 Parameter");
    }
    Task5Employee(int id,String name,int sal){
        this.empId=id;
        this.empName=name;
        this.salary=sal;
        System.out.println("Constructor with 3 Parameter");
    }

}