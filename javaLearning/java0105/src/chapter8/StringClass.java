package chapter8;

public class StringClass {
    public static void main(String []args){
        char [] helloArray={'l','i','x','u','e','l','i','a','n','g'};
        String helloString=new String(helloArray);
        System.out.println(helloString);

        int len=helloString.length();
        System.out.println(len);

        String str=" is playing dota2~~~";
        System.out.println(helloString+str);

        //格式化输出字符串,静态方法 format() 能用来创建可复用的格式化字符串,和哥哥上次给的代码输出部分一样



    }
}
