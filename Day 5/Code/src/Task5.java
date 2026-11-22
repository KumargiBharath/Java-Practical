import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int actual[]=new int[5];
        System.out.println("Enter the original array elements: ");
        for(int i=0;i<actual.length;i++){
            actual[i]=sc.nextInt();
        }
        int reversed[]=new int[5];
        for(int i=actual.length-1;i>=0;i--){
            reversed[actual.length-1-i]=actual[i];
        }
        System.out.println("Reversed array is :");
        for(int i:reversed){
            System.out.println(i);
        }
    }
}
