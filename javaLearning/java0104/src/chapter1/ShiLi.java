package chapter1;

public class ShiLi {
    public String name;
    private double salary;

    public ShiLi(String name,   double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "emp{" + "name='" + name + '\'' + ", salary=" + salary + '}';
    }

    public static void main(String []args){
        ShiLi emp=new ShiLi("lxl",100);

        System.out.println(emp);

    }
}
