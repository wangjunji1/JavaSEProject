package com.wangjunji.day08.demo02;

/**
 * ==是进行对象地址值比较，如果确认需要字符串的内容比较，可以使用两个方法
 * public boolean equals(Object obj):参数可以是任何对象，只有参数是一个字符并且内容相同的才会给true,否则
 * 返回true
 * 注意事项：
 * 任何对象都能用object进行接收
 * eqauls方法具用对称性。也就是a.equals(b)和b.equals(a)一样
 * 如果比较双方一个常量一个变量，推荐把常量字符串写在前面
 * public boolean equalsIgnoreCase(String str) 忽略大小写，进行内容比较
 */
public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));

        String str4 = "hello";
        System.out.println(str4.equals(str1));
        System.out.println("==============================");
        String str5 = null;
        System.out.println("abc".equals(null));
        //不推荐，报错，空指针异常NullPointerExcption
        //System.out.println(str5.equals("abc"));

        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));
        System.out.println(strA.equalsIgnoreCase(strB));
        //注意，只有英文字母区分大小写，其他都不区分大小写
        System.out.println("abc-123".equalsIgnoreCase("abc壹123"));

    }
}
