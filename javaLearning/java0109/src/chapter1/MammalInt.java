package chapter1;

public class MammalInt implements Animal{
    public void eat(){
        System.out.println("Mammal eats");
    }
    public void travel(){
        System.out.println("Mammal travels" );
    }
    public int noOfLegs(){//这个方法在这的作用是什么？？？
        return 0;
    }
    public static void main(String []args){
        MammalInt m=new MammalInt();
        m.eat();
        m.travel();
    }
}
