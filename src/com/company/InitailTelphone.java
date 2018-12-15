package com.company;
/*import scond.Telphone;*/

public class InitailTelphone {
    //  psvm 快捷键创建main方法
    public static void main(String[] args) {

        // 实例化Telphone方法，不传入参数，调取无参构造方法
        Telphone phonen=new Telphone();
        // 实例化Telphone方法，传入对应个数个精度参数，调用有参构造方法
        Telphone phone2= new Telphone(5.3f,3f,4f);
        phone2.cpu=2.2f;
        phone2.setScreen(4.4f);
        System.out.println(phone2.getScreen());

        //调用其他的包的同名方法
        //Telphone phone3=new Telphone();


    }
}
