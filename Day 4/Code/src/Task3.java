public class Task3 {
    public static void main(String[] args) {
        int number=7;
        boolean isprime=true;
        for(int i=2;i<7;i++){
            if(number<=1){
                isprime=false;
            }
            if(number%i==0){
                isprime=false;
                break;
            }
        }
        if(isprime){
            System.out.println("Its a prime number");
        }
        else{
            System.out.println("Not prime number");
        }
    }
}
