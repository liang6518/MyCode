package chapter1;
//两种不同的构造器的this用法
public class BrithData {
    private int year;
    private int month;
    private int day;

    BrithData(int ye){
        year=ye;
    }

    BrithData(){
        this(1987);
    }

    public static void main(String []args){
        BrithData b1=new BrithData(2009);
        BrithData b2=new BrithData();

        int c1=b1.year;
        int c2=b2.year;

        System.out.println(c1);
        System.out.println(c2);

    }


}
