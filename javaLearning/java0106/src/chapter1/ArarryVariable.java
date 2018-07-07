package chapter1;

public class ArarryVariable {
    public static void main(String []args){
        int size=10;

        double [] myList=new double[size];

        myList[0]=5.6;
        myList[1]=4.5;
        myList[2]=3.3;
        myList[3]=13.2;
        myList[4]=4.0;
        myList[5]=34.33;
        myList[6]=34.0;
        myList[7]=45.45;
        myList[8]=99.993;
        myList[9]=11123;

        double total=0.0;
        for (int i=0;i<size;i++){
            total+=myList[i];
        }
        System.out.println(total+"\n");

        double [] mylist1={1.9,2.9,3.4,3.5};
        for(int i=0;i<mylist1.length;i++){
            //数组作为函数的参数传递给方法
            System.out.println(mylist1[i]);
        }

        double totalOne=0.0;
        for(int i=0;i<mylist1.length;i++){
            totalOne+=mylist1[i];
        }
        System.out.println("\n"+totalOne+"\n");

        double max=mylist1[0];
        for(int i=0;i<mylist1.length;i++){
            if (max<mylist1[i]){
                max=mylist1[i];
            }
        }
        System.out.println(max+"\n");

        for (double x:mylist1){
            System.out.println(x);
        }
        String s[][]=new String[2][];
        s[0]=new String[2];
        s[1]=new String[3];
        s[0][0]=new String("good");
        s[0][1]=new String("luck");
        s[1][0]=new String("to");
        s[1][1]=new String("you");
        s[1][2]=new String("!");
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.println(s[i][j]);
            }
        }

    }
}
