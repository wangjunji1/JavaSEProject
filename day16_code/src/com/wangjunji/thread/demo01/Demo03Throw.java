package com.wangjunji.thread.demo01;

public class Demo03Throw {
    public static void main(String[] args) {
        int arr[] = new int[3];
        int e = getElement(arr,3);
        System.out.println(e);
    }

    public static int getElement(int[] arr,int index){
        /**
         * 我们可以对传递过来的参数数组，进行合法性校验
         * 如果数组arr的值是null,
         * 那么我们就抛出空指针异常，告诉方法的调用，传递的参数有问题
         * 注意，nullPoniterException是一个运行期异常，我们不用处理，默认交给jvm处理
         * arrayindexoutofboundexception是一个运行期异常，我们不用处理，默认交给jvm处理
         */
        if(arr==null){
            throw new NullPointerException("传递的数组的值是null");
        }

        if(index<0 || index >arr.length -1){
            throw  new ArrayIndexOutOfBoundsException("传递的索引超出了数组的使用范围");
        }
        return arr[index];
    }
}
