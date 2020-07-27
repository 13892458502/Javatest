import java.util.Arrays;

//class SampleDemo {
//    private int a;//成员变量
//
//    public int getA() {//获取这个成员变量
//        return a;
//    }
//
//    public void setA(int a) {//设置这个成员变量
//        this.a = a;//this表示调用该对象的引用
//    }
//}
//
//public class TestDemo {
//
//    public static void main(String[] args) {
//        SampleDemo sd = new SampleDemo();//实例化一个对象
//        sd.setA(20);//给对象里的成员变量赋值
//        System.out.println(sd.getA());
//    }
//}

public class TestDemo{

    private int count;

    public static void main(String[] args) {

        TestDemo test=new TestDemo(88);

        System.out.println(test.count);

    }

    TestDemo(int a) {

        count=a;

    }

}
