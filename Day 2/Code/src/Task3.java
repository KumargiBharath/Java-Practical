import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter basic salary:");
        double basicSalary = sc.nextDouble();

        System.out.println("Enter House Rent Allowances:");
        double hra = sc.nextDouble();

        System.out.println("Enter other allowances:");
        double allowances = sc.nextDouble();

        System.out.println("Enter deductions:");
        double deductions = sc.nextDouble();

        double totalSalary = basicSalary + hra + allowances - deductions;

        System.out.println("Monthly Salary: " + totalSalary);
    }
}
