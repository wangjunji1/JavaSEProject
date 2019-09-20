package demo;

public class ComparingValues {
    public static void main(String[] args) {
        comapreFloat();
    }

    public static void comapreFloat(){
        Float float1 = new Float("9.675");
        Float float2 = new Float("7.3826");
        Float float3 = new Float("23467.373");
        System.out.println("Using compare to ");
        System.out.println(float1.compareTo(float2));
        System.out.println(float1.compareTo(float3));
        System.out.println(float1.compareTo(float1));
        System.out.println(float3.compareTo(float2));
        System.out.println("Using compare");
        System.out.println(Float.compare(float1,float2));
        System.out.println(Float.compare(float2,float3));
        System.out.println(Float.compare(float1,float1));
        System.out.println(Float.compare(float3,float2));
    }

}
