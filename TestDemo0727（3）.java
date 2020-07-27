class People{
    private String name;
    private int age;
    private String sex;

    public People(){
        this("张三",18,"男");
        //People类的构造方法中调用其他构造方法，this(参数列表)
    }
    public People(String name,int age,String sex){
        System.out.println(name+" "+age+" "+sex);
        //构造方法
    }

    public void show(){
        System.out.println(this.name+" "+this.age+" "+this.sex);
    }

}

public class TestDemo {
    public static void main(String[] args) {
        People p = new People();
        p.show();
    }
}
