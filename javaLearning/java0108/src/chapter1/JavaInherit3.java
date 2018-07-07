package chapter1;

public class JavaInherit3 {
    public static void main(String []args){
        SubClass a1=new SubClass();
        SubClass a2=new SubClass(200);
    }
}
class SuperClass{
    private int n;
    SuperClass(){
        System.out.println("SuperClass()");
    }
    SuperClass(int n){
        System.out.println("SuperClass(int n)");
        this.n=n;
    }
}
class SubClass extends SuperClass{
    private int n;
    SubClass(){
        super(300);
        System.out.println("SubClass");
    }
    SubClass(int n){
        System.out.println("SubClass(int n):"+n);
        this.n = n;
    }
}