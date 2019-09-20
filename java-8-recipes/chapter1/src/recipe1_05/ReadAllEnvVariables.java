package recipe1_05;

import java.util.Map;

public class ReadAllEnvVariables {
    public static void main(String[] args) {
        if(args.length>0){
            String value = System.getenv(args[0]);
            if(value != null ){
                System.out.println(args[0].toUpperCase()+"="+value);
            }else {
                System.out.println("No such envirormnet variable exists");
            }
        }else {
            Map<String, String> getenv =   System.getenv();
            for (String s : getenv.keySet()) {
                System.out.println("key"+":"+s+"="+getenv.get(s));
            }

        }
    }
}
