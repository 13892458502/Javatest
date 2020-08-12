class Money implements Cloneable{
    public int m=10;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person implements Cloneable{
    public String name;
    public Money money ;

    public Person(String name) {
        this.name = name;
        this.money = new Money();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        person.money = (Money) this.money.clone();
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", money=" + money.m +
                '}';
    }
}



public class TestDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("小明");
        Person person2 = (Person) person1.clone();
        person2.name = "小红";
        person2.money.m = 15;
        System.out.println(person1);
        System.out.println(person2);
    }
}
