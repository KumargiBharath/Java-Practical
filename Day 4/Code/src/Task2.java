import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find the factorial:");
        int x=sc.nextInt();
        int res=1;
        for(int i=1;i<=x;i++){
            res*=i;
        }
        System.out.println("Result is : "+res);
    }
}
