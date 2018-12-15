package com.company;

public class Imooc323 {
    public static void main(String [] ags){
        String filename="Imooc.java";
        String email="abcde@sf.com";
        //.在字符串中 最后出现的位置
        int a=filename.lastIndexOf(".");
        //获取 . 之后的字符串
        String b=filename.substring(a+1,filename.length());
        //用   eqauls 比较获取的字符是否符合 数据
        if (a!=-1&&a!=0&&b.equals("java")){
            System.out.println("1");
        }else System.out.println("2");
        System.out.println(b);

        int c=email.indexOf("@");
        int d=email.indexOf(".");
        if (c!=-1&&c!=0&&c<d){
            System.out.println("3");
        }else System.out.println("4");
    }



}
