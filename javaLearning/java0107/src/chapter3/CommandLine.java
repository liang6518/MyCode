package chapter3;
//是不是得在命令行才能生效
public class CommandLine {
    public static void main(String []args){
        for (int i=0;i<args.length;i++){
            System.out.println("args["+i+"]"+args[i]);
        }
    }
}
