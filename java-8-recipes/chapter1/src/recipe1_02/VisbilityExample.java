package recipe1_02;

class TestClass{
    private long visialeOnlyInThisclass;;
    double visibfromEntriypackage;
    void setLong(long val){
        visialeOnlyInThisclass = val;
    }
    double getLong(){
        return visibfromEntriypackage;
    }
}




public class VisbilityExample {
    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.setLong(32768);
        tc.visibfromEntriypackage = 31.1566;
        System.out.println(tc.getLong());

        System.out.println(tc.visibfromEntriypackage);    }
}
