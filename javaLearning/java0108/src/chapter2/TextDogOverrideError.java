package chapter2;

public class TextDogOverrideError {
    public static void main(String []args){
        Animal1 a=new Animal1();
        Animal1 b=new Dog1();
        a.move();
        b.move();
        //b.bark();加上这一行将出现找不到符号的错误

    }
}
class Animal1{
    public void move(){
        System.out.println("动物可以移动");
    }
}
class Dog1 extends Animal1{
    public void move(){
        System.out.println("狗可以跑和走");
    }
    public void bark(){
        System.out.println("狗可以吠叫");
    }
}

