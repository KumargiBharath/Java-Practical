class bankAccount{
    private long accountnumber;
    private int balance;

    public void setAccountnumber(long accountnumber) {
        this.accountnumber = accountnumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposite(int amount){
        if(balance>0) {
            balance += amount;
        }
    }
    public void withDraw(int amount){
        if(amount<balance) {
            balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }
}
public class Task2 {
    public static void main(String[] args) {
        bankAccount one=new bankAccount();
        one.setAccountnumber(123444567);
        one.setBalance(50000);
        one.deposite(10000);
        one.withDraw(50000);
        System.out.println(one.getBalance());

    }
}
