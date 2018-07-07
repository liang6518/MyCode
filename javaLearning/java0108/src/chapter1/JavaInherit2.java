package chapter1;

import java.util.Date;

public class JavaInherit2 {
    public static void main(String []args){
        Animal a=new Animal();
        a.eat();
        Dog d=new Dog();
        d.eatText();
    }
}
class Animal{
    void eat(){
        System.out.println("animal : eat");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("dog : eat");
    }
    void eatText(){
        this.eat();
        super.eat();
    }
}