import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Demo4 {
    private InputStream inputStream;
    static {
        try {
            InputStream  inputStream = new FileInputStream("/etc/passwd");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public void test1() {
        /** 类方法里面不能用静态代码块
         static {
         System.out.println("hello");
         }
         **/
    }

    //执行时机
    /**
     * 静态代码块在类加载时候就运行了，而且只运行一次，并且优先于各种代码以及构造函数，
     * 如果一个类中有多个静态代码块，会按照书写顺序依次执行。后面在比较进候会通过具体实例来证明
     */

}
