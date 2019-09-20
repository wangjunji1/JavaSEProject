package demo01;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /**
     直接打印对象的地址值没有意义，需要重写object类的toString方法
     打印对象的属性(name,age)
     */
    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj  == null || getClass() != obj.getClass() ) return false;
        Person person = (Person) obj;
        return age==person.age && Objects.equals(name,person.name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

}
