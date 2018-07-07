package chapter5;

public class Run {
    public static void main(String []args){
        SetGetMethod s=new SetGetMethod();
        s.setAge(20);
        s.setName("sda");
        s.setIdString("1234");
        System.out.print("Name : " +s.getName()+"\n"+"Age : "+s.getAge()+"\n"+"id: "+s.getIdNum());
    }
}
