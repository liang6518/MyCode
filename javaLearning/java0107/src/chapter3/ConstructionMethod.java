package chapter3;

public class ConstructionMethod {

    public static void main(String []args){
        Myclass t1=new Myclass(10);
        Myclass t2=new Myclass(20);
        System.out.println(t1.x+"\t"+t2.x);
    }
}

class Myclass{

    int x;
    Myclass(int i){
        x=i;
    }
}
