import java.awt.print.Book;
import java.util.Date;
import static java.lang.Math.*;

class Students implements Comparable{
    private String name;
    private int score;
    public Students(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Students s = (Students)o;
        if(s.score > ((Students) o).score){
            return 1;
        }else if(s.score == ((Students) o).score){
            return 0;
        }else{
            return -1;
        }
    }
}


public class TestDemo {
    public static void main(String[] args) {

    }








//class Animal{
//    public String name;
//    public Animal(String name){
//        this.name = name;
//    }
//}
//interface IFlying{
//    void fly();
//}
//interface IRunning{
//    void run();
//}
//interface ISwimming{
//    void swim();
//}
//class Dog extends Animal implements IRunning{
//    public Dog(String name){
//        super(name);
//    }
//    @Override
//    public void run() {
//        System.out.println(this.name+"正在跑步");
//    }
//}
//class Frog extends Animal implements IRunning,ISwimming{
//    public Frog(String name){
//        super(name);
//    }
//    @Override
//    public void run() {
//        System.out.println(this.name+"正在跑步");
//    }
//    @Override
//    public void swim() {
//        System.out.println(this.name+"正在游泳");
//    }
//}
//class Duck extends Animal implements IRunning,ISwimming,IFlying{
//    public Duck(String name){
//        super(name);
//    }
//    @Override
//    public void fly() {
//        System.out.println(this.name+"正在飞");
//    }
//    @Override
//    public void run() {
//        System.out.println(this.name+"正在游泳");
//    }
//    @Override
//    public void swim() {
//        System.out.println(this.name+"正在游泳");
//    }
//}
//
//public class TestDemo {
//    public static void main(String[] args) {
//        Dog dog = new Dog("汪汪");
//        Frog frog = new Frog("呱呱");
//        Duck duck = new Duck("嘎嘎");
//        dog.run();
//        frog.run();
//        frog.swim();
//        duck.fly();
//        duck.run();
//    }
    //interface Shape{
//    abstract public void draw();
//}
//
//class Circle implements Shape{
//    @Override
//    public void draw() {
//        System.out.println("画一个圆圈○");
//    }
//}

//abstract class Shape {
//   abstract public void draw();
//}
//class Circle extends Shape{
//    public void draw(){
//        System.out.println("画一个圆圈○");
//    }
//}
//class Rectangle extends Shape{
//    public void draw(){
//        System.out.println("画一个矩形□");
//    }
//}
//class Triangle extends Shape{
//    public void draw(){
//        System.out.println("画一个三角△");
//    }
//}
//    public static void main(String[] args) {
//        Shape shape1 = new Circle();
//        Shape shape2 = new Rectangle();
//        Shape shape3 = new Triangle();
//        drawMap(shape1);
//        drawMap(shape2);
//        drawMap(shape3);
//    }
//    public static void drawMap(Shape shape){
//        shape.draw();
//    }
//
//    public void eat(String food){
//        System.out.println("我是一只小动物");
//        System.out.println(this.name+"正在吃"+food);
//    }
//}

//class Dog extends Animal{
//    public Dog(String name){
//        super(name);
//    }
//}

//class Bird extends Animal{
//    public Bird(String name){
//        super(name);
//    }
//    public void eat(String food){
//        super.eat(food);
//        System.out.println("我是一只小鸟");
//        System.out.println(this.name+"正在吃"+food);
//    }
//    public void fly(){
//        System.out.println(this.name+"正在飞");
//    }
//}
//    public class TestDemo {
//    public static void main(String[] args) {
//        Animal animal = new Bird("啾啾");
//        animal.eat("谷子");
//    }
//    public static void main(String[] args) {
//        Animal animal = findAnimal();
//        animal.eat("谷子");
//        findAnimal().eat("谷子");
//    }
//    public static Animal findAnimal(){
//        Bird bird = new Bird("啾啾");
//        return bird;
//    }
//    public static void main(String[] args) {
//        Bird bird = new Bird("啾啾");
//        Dog dog = new Dog("汪汪");
//        Animal animal = new Animal("动物");
//        feed(bird);
//        feed(dog);
//        feed(animal);
//    }
//    public static void feed(Animal animal){
//        animal.eat("谷子");
//    }

//    public static void main(String[] args) {
//        Dog dog = new Dog("旺旺");
//        dog.eat("骨头");
//        Bird bird = new Bird("啾啾");
//        bird.eat("米粒");
//        bird.fly();
//    }
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
