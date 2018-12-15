package com.company;

public class HelloWorld {
    //外部 私有 属性
    private String name = "imooc";
    //外部类 成员属性
    int age = 20;
    //创建一个外部类
    public class Inner {
        String name = "imooc";
        //内部类的 内部 方法
        public void show(){
            System.out.println("外部类属性name"+HelloWorld.this.name);
            System.out.println("内部类属性name"+name);
            System.out.println("内部类中的age"+age);
        }
    }

    public static void main(String[] args) {

    }
}
