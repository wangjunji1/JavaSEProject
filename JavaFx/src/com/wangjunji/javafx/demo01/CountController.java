package com.wangjunji.javafx.demo01;

public class CountController {
    private CountModel model;
    private CountController(){
        this.model = model;
    }

    public String incrementButtonPressed(){
        model.updateBy(1);
        return "count is"+model.getCount();
    }

    public String decrementButtonPressed(){
        model.updateBy(-1);
        return "count is "+model.getCount();
    }

}
