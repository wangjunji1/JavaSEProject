package Demo03;

public class Body {  //外部类
    public class Heart{
        public void heart(){
            System.out.println("心脏跳动，蹦蹦蹦");
            System.out.println("我的名字中"+name);
        }
    }
    private String name;
    public void methodBody(){
        System.out.println("外部类的方法");
        new Heart().heart();
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }


}
