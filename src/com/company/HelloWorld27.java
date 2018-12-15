package com.company;

public class HelloWorld27 {
    //定义一个 外部 静态 私有属性name
    private static int score = 84;
    //静态 内部 方法
    public static class SInner{
        int score = 91;
        public void show(){
            System.out.println("访问内部类中的score:"+score);
            System.out.println("访问外部类中的scroe:"+HelloWorld27.score);
        }
    }

    public static void main(String[] args) {
        SInner si = new SInner();
        si.show();
    }
}
