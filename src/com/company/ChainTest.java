package com.company;

public class ChainTest {
    public static void main(String [] strings){
    ChainTest chain=new ChainTest();
    try{
        chain.test2();
    }catch(Exception e){
        e.printStackTrace();
    }

    }
    //定义一个要抛出的异常 需要再方法之前声明抛出异常 throws
    public void test1() throws Exception{
         //抛出新异常
        throw new DrunkException("212");
    }
    public void test2(){
        try {
            test1();    //由于 test1  是异常  所以需要用 try-catch 来捕获异常
        } catch (Exception e) {

            //RuntimeException runtime=new RuntimeException("开车不喝酒");
            RuntimeException runtime=new RuntimeException(e);
            runtime.initCause(e);   //异常的传递，把上层异常e 传递到 实例化 runtime 异常中，
            throw runtime;  //抛出都到传递的 runtime异常
        }
    }
}
