package com.wangjunji.javafx.demo01;

public class CountModel {
    private int count = 1;
    public void updateBy(int n){
        count+=n;
    }
    public int getCount(){
        return count;
    }
}
