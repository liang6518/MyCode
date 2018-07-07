package chapter6;

public class Exception2_2 {
    public static void main(String []args){
        Exception2_1 c=new Exception2_1(101);
        System.out.println("Depositing $500...");
        c.deposit(500);
        try {
            System.out.println("\nWithdrawing $100...");
            c.withdraw(100);
            System.out.println("\nWithdrawing $600...");
            c.withdraw(600);
        }catch (Exception2 e){
            System.out.println("Sorry, but you are short $"+e.getAmount());
            e.printStackTrace();
        }
    }
}
