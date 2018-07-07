package chapter2;

//static修饰符用来创建类方法和类变量。
public class StaticModifier {
    private static int numInstances = 0;

    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    public static void main(String[] args) {

        System.out.println(StaticModifier.getCount());

        for (int i = 0; i < 500; ++i) {
            StaticModifier.addInstance();
        }

        System.out.println(StaticModifier.getCount());

    }
}
