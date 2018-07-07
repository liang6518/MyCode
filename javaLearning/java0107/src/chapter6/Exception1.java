package chapter6;
//下面的例子中声明有两个元素的一个数组，当代码试图访问数组的第三个元素的时候就会抛出一个异常。
public class Exception1 {
    public static void main(String []args){
        int a[]=new int[2];
        try {
            System.out.println("Access element three :"+a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown  :"+e);
        }//之间不能添加任何代码
        finally {
            a[0]=6;
            System.out.println("First element value: " +a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
