import java.util.Date;
import static java.lang.Math.*;

class Animal{
    public String name;
    public Animal(String name) {
        this.name = name;
    }

    public void eat(String food){
        System.out.println(this.name+"吃"+food);
    }
}
class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
}

class Bird extends Animal{
    public Bird(String name){
        super(name);
    }
    public void fly(){
        System.out.println(this.name+"正在飞");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("旺旺");
        dog.eat("骨头");
        Bird bird = new Bird("啾啾");
        bird.eat("米粒");
        bird.fly();
    }
//    public static void main(String[] args) {
//        double x = 10.5;
//        double y = 3.0;
//        double result = sqrt(pow(x,y)+pow(x,y));
//        System.out.println(result);
//    }
//    public static void main(String[] args) {
//        Date time = new Date();
//        System.out.println(time.getTime());
//    }
//    public static void main(String[] args) {
//        java.util.Date time = new java.util.Date();
//        System.out.println(time.getTime());
//    }
}
