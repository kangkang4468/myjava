package com.company;
//定义一个外部类
public class HelloWorlf {

    //定义一个 私有 字符 变量name
    private String name = "immooc";
   int age= 20;

    //定义一个人Inner的内部类
    public class Inner{
        //内部类变量
        String name="我爱顺丰";
        //定义一个内部类的内部方法
        public void show(){
            System.out.println("外部类变量："+HelloWorlf.this.name);
            System.out.println("内部方法变量："+name);
            System.out.println("外部age："+age);
        }
    }

    public static void main(String[] args) {
        HelloWorlf helle=new HelloWorlf();
        Inner  inner=helle.new Inner();
        inner.show();
    }
}
