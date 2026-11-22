import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int empids[]=new int[]{12,34,62,88,54,67};
        System.out.println("Enter the employee id to search for :");
        int target=sc.nextInt();
        for(int i=0;i<empids.length;i++){
            if(target==empids[i]){
                System.out.println("Employee Exists");
            }
        }

    }
}
