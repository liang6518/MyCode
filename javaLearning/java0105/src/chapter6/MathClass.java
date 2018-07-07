package chapter6;
//涉及到的主要内容是装箱和拆箱
public class MathClass {
    public static void main(String []args){
        Integer x=5;//因为使用了对象，所以需要进行装箱，
        x+=10;//对x进行加运算，所以要进行拆箱

        System.out.println(x);
        System.out.println(Math.sin(Math.PI/3));
        System.out.println(Math.toDegrees(Math.PI/3));

    }
}
