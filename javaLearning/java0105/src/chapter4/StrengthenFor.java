package chapter4;

public class StrengthenFor {
    public static void main(String []args){
        int [] numbers={10,20,30,40,50};
        for (int x:numbers){
        System.out.print(x+",");
        }

        System.out.print("\n");
        String [] names={"li1","li2","li3","li4","li5"};

        for(String n:names){
            System.out.print(n+",");
        }
    }
}
