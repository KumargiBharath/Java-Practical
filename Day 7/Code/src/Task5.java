public class Task5 {
    static int i=100;
    public static void main(String[] args) {
        System.out.println(i);
        Task5 call=new Task5();
        call.display();
    }
    public void display(){
        System.out.println(i);
    }
}
