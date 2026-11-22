import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the username:");
        String name=sc.nextLine();
        System.out.println("Enter the password:");
        String pass=sc.nextLine();
        if(name.equals("Harry") && pass.equals("5599")){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
