package chapter2;

public class TextDogOverrideSuper {
    public static void main(String []args){
        Animal2 a=new Dog2();
        a.move();
    }
}
class Animal2{
    public void move(){
        System.out.println("动物可以移动");
    }
}
class Dog2 extends Animal2{
    public void move(){
        super.move();
        System.out.println("狗可以跑和走");
    }
}