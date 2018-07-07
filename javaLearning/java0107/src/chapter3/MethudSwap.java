package chapter3;
//只是形参的交换
public class MethudSwap {
    public static void main(String []args){
        int num1=1;
        int num2=2;
        swap(num1,num2);
        System.out.println(num1+"\t\t"+num2);
    }
    public static void swap(int n1,int n2){
        System.out.println(n1+"\t\t"+n2);
        int temp=n1;
        n1=n2;
        n2=temp;
        System.out.println(n1+"\t\t"+n2);
    }
}
