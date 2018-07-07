package chapter5;

public class Switch {
    public static void main(String []args){
        char grade='C';

        System.out.print("你的等级是");
        switch (grade){

            case 'A':
                System.out.print("优秀");
                break;
            case 'B':
            case 'C':
                System.out.print("良好");
                break;
            case 'D':
                System.out.print("及格");
            case 'E':
                System.out.println("你需要在努力");
            default :
                System.out.println("未知等级");
        }


    }
}
