package com.company;

public class Telphone {
    //private 参数封装修饰符，然后需要get方法和set方法调用参数
    private float screen;
    public float cpu;
    private float mem;
    public void seedMessage(){
        System.out.println("T");

    }
    public float getScreen() {
        return screen;
    }
    public void setScreen(float screen){
        this.screen=screen;
        this.seedMessage();
    }

    //构造一个无参数的构造方法
    public Telphone(){
        System.out.println("com.company的一个无参构造方法被执行");
    }

    public Telphone(float newScreen,float newCpu,float newMem) {
        screen=newScreen;
        cpu=newCpu;
        mem=newMem;
        System.out.println("有参构造方法被执行！");
    }
}
