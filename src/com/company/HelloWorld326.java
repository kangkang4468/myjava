package com.company;

public class HelloWorld326 {
    public static void main(String[] args){
        StringBuilder str=new StringBuilder("为何总沉默寡言");
        str.append("人群中也算抢眼");
        str.append(520);
        System.out.println("字节长度："+str.length());
        System.out.println("插入前："+str);

        str.insert(7,",");
        String str2=str.toString();
        System.out.println("转换后："+str2);

        StringBuilder str3=new StringBuilder();
//        str3.insert("")
        str3.append("抢眼的孤独难眠");
        for (int i=0;i<str3.length()/2;i++){
            str3.insert((i*2)+2,',');
        }
        System.out.println("转换完成："+str3);
    }
}
