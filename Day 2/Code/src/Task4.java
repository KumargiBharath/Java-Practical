import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter House Rent:");
        double hr = sc.nextDouble();
        System.out.println("Enter Petrol Cost:");
        double pc = sc.nextDouble();
        System.out.println("Enter Grocessary Cost:");
        double gs = sc.nextDouble();
        double totalcost=hr+pc+gs;
        System.out.println(totalcost);
    }
}
