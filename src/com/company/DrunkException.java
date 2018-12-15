package com.company;

//声明一个异常 继承 Exception异常类
public class DrunkException extends Exception {

    public DrunkException(){

    }
    //有参DrunkException异常
    public DrunkException(String ss){
        super(ss);  //继承父类有参方法
    }

}
