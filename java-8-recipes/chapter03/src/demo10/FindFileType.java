package demo10;

public class FindFileType {
    private static String fileName ="RegExamples.java" ;
    public static void main(String[] args){
            findFileType(fileName);
    }

    public static void findFileType(String fileName){
        System.out.println("Finding file type of :"+fileName);
        if(fileName.endsWith(".txt")){
            System.out.println("Text file");
        }else if(fileName.endsWith(".doc")){
            System.out.println("doc file");
        }else if(fileName.endsWith(".xls")){
            System.out.println("Excel file");
        }else{
            System.out.println("other type of file");
        }

    }
}
