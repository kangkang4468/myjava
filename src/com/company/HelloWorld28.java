package com.company;
//外部类
public class HelloWorld28 {
    private String name = "Imooc";
    //定义一个外部类 show
    public void show(){
        //定义一个内部类
        class  MInner{
            int score = 83;
            public int getScore(){
                return score+10;
            }
        }
        // 创建方法内部类的对象
        MInner minne = new MInner();
        int newScore = minne.getScore();
        System.out.println("姓名：" + name + "\n加分后的成绩：" + newScore);

    }

    public static void main(String[] args) {
        HelloWorld28 hello28 = new HelloWorld28();
        System.out.println("姓名："+hello28.name);
        hello28.show();
    }
}
