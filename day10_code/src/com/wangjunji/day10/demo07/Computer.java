package com.wangjunji.day10.demo07;

import java.awt.event.MouseAdapter;

public class Computer {

    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }

    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }
    //使用USB设备的方法，使用接口作为方法的参数
    public void useDevice(USB usb){
        usb.open();
        if(usb instanceof Mouse ){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }

        if(usb instanceof  KeyBoard){
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.type();
        }
        usb.close();
    }

}
