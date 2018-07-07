package chapter3;
public class Method1 {
    public static int max(int num1,int num2){
        int result;
        if (num1>num2){
            result=num1;
        }
        else{
            result=num2;
        }
        return result;
    }

    public static void main(String []args){
        Method1 me=new Method1();
        System.out.println(me.max(2,3));
    }
}
