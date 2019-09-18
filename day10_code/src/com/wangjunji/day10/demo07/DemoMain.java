package com.wangjunji.day10.demo07;

public class DemoMain {
    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();
        //准备一个鼠标，供电脑使用
        //首先进行向上转型
        USB usbMouse = new Mouse();
        computer.useDevice(usbMouse);
        KeyBoard keyBoard = new KeyBoard();
        computer.useDevice(keyBoard);
    }
}
