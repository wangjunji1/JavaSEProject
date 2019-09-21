package Demo03;

import java.util.Date;
@SuppressWarnings("all")
public class AnnoDemo2 {
    @Override
    public String toString(){
        return super.toString();
    }

    @Deprecated
    public void show1(){

    }

    public void show(){

    }

    public void demo(){
        show1();
        Date date = new Date();
    }
}
