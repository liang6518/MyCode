package chapter2;
//分为final变量，final方法，final类
public class FinalModifier {
    final int value=10;

    public static final int BOXWIDTH=1;
    static final String TITLE="manager";

    public void changeValue(){
        //value=12;// final 对象里的数据可以被改变。也就是说 final 对象的引用不能改变
    }

    public final void changeValue1(){

    }

    final class Test{

    }
}
