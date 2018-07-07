package chapter3;

import com.sun.org.apache.regexp.internal.RE;

public class EmployeeVirtualMethod {
    private String name;
    private String address;
    private int number;
    public EmployeeVirtualMethod(String name,String address,int number){
        System.out.println("Employee 构造函数");
        this.name=name;
        this.address=address;
        this.number=number;
    }
    public void mailCheck(){
        System.out.println("邮寄支票给： "+this.number+ " " + this.address);
    }
    public String toString(){
        return name + " " + address + " " + number;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String newAdress){
        address=newAdress;
    }
    public int getNumber(){
        return number;
    }
}
