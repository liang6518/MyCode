package chapter6;
//为了展示如何使用我们自定义的异常类，
//在下面的 CheckingAccount 类中包含一个 withdraw() 方法抛出一个 InsufficientFundsException 异常。
public class Exception2_1 {
    private double balance;
    private int number;
    public Exception2_1(int number){
        this.number=number;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount) throws Exception2{
        if (amount<=balance){
            balance-=amount;
        }
        else {
            double need=amount-balance;
            throw new Exception2(need);
        }
    }
    public double getBalance(){
        return balance;
    }
    public int getNumber() {
        return number;
    }
}
