package Demo01;

/**
 * 对于成员变量来说，如果使用final关键字修饰，这么这个变量也照样不可变
 * 由于成员变量具有默认，所以用了final之后必须手动赋值,不会再给默认值了
 * 对于final的成员变量，要么使用直接赋值，要么通过构造赋值，二者选其一
 * 必须保证类当中所有重载的构造方法，都最终会对fianl的成员变量进行赋值
 */

public class Person {
    private final String name ;

    public Person(){
        name="鹿晗";
    }

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
