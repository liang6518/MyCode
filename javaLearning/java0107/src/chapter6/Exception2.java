package chapter6;
//以下实例是一个银行账户的模拟，通过银行卡的号码完成识别，可以进行存钱和取钱的操作。
////自定义异常类，继承Exception类
public class Exception2 extends Exception {
    private double amount;
    public Exception2(double amount){
        this.amount=amount;
    }
    public double getAmount() {
        return amount;
    }
}
