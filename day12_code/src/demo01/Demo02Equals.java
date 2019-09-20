package demo01;

public class Demo02Equals {
    public static void main(String[] args) {
        /**
         * Person类默认继承了Object类，所以可以使用Object类的equals方法
         * boolean equals指示其他某个对象是否与此对象相等
         *
         */
        Person p1 = new Person("迪丽热巴",19);
        Person p2 = new Person("迪丽热巴",19);
    }
}
