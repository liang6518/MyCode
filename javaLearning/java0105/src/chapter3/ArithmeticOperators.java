package chapter3;

public class ArithmeticOperators {
    public static void main(String []args){
        int a=60;
        int b=13;
        int c=0;
        boolean e=true;
        boolean d=false;



        System.out.println(a++);//注意进行了两次加法
        System.out.println(++a);
        System.out.println((a==b));
        System.out.println((a!=b));

        c=a&b;
        System.out.println(c);

        System.out.println((d&&e));
        System.out.println((d||e));
        System.out.println(!(d&&e));

        a+=b;
        System.out.println(a);
    }
}
