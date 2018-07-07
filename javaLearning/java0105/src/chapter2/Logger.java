package chapter2;

public class Logger {
    private String format;
    //通过定义public方法是不能被其他类访问的format变量能够被其他类访问
    public String getFormat(){
        return this.format;
    }
    public void setFormat(String format){
        this.format=format;
    }
}
