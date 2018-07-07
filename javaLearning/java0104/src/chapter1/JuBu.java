package chapter1;

public class JuBu {
    public void puppyAge(){
        int age=0;//必须在这初始化
        age=age+7;
        System.out.println(age);


    }
    public static void main(String []args){
        JuBu age1=new JuBu();
        age1.puppyAge();
    }
}
