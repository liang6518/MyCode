package chapter3;
//大概能懂，可有些细节很模糊
public class Text {
    public static void main(String []args){
        show(new Cat());
        show(new Dog());
        Animal a=new Cat();
        a.eat();
        Cat c=(Cat)a;
        c.work();
    }
    public static void show(Animal a){
        a.eat();//这句话在这是什么意思，？？？懂了
        if (a instanceof Cat){
            Cat c=(Cat)a;
            c.work();
        }
        else {
            Dog c=(Dog)a;
            c.work();
        }
    }
}
abstract class Animal{
    abstract void eat();
}
class Cat extends Animal{
    public void eat(){
        System.out.println("吃鱼");
    }
    public void work(){
        System.out.println("抓老鼠");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("吃骨头");
    }
    public void work(){
        System.out.println("看家");
    }
}
