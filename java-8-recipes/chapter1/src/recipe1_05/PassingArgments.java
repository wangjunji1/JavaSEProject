package recipe1_05;

public class PassingArgments {
    public static void main(String[] args) {
        if(args.length>0){
            System.out.println("argments that where passed to the program");
            for(String arg:args){
                System.out.println(arg);
            }
        }else{
            System.out.println("No argments passed to the program");

        }
    }
}
