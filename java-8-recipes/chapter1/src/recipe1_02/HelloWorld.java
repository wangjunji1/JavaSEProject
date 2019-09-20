package recipe1_02;

class HelloMessage {
    private String greeting = "";

    public HelloMessage(){
        this.greeting = "Default Message";
    }

    public void setMessage(String m){
        this.greeting = m;

    }

    public String getMessage(){
        return this.greeting.toUpperCase();
    }

}
public class HelloWorld {
    public static void main(String[] args) {
        HelloMessage hm = new HelloMessage();
        System.out.println(hm.getMessage());
        hm.setMessage("Hello, world");
        System.out.println(hm.getMessage());
    }

}
