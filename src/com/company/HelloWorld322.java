package com.company;

public class HelloWorld322 {
    public static void main(String[] args){
        String  s1="imooc";
        String  s2="imooc";

        String  s3="i love"+s1;
        String  s4="i love"+s1;
        System.out.println("s1跟s2："+(s1==s2));
        System.out.println("s1跟s3:"+(s1==s3));
        System.out.println("s4跟s3:"+(s4==s3));
        System.out.println("s3跟s4的值："+s3.equals(s4));
        System.out.println("s1跟s2的值："+s1.equals(s2));


}}
