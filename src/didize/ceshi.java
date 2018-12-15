package didize;

import java.util.Scanner;

public class ceshi {
    public static void main(String[] args) {
        //实例化Scanner   使用键盘输入
        Scanner scanner=new Scanner(System.in);
        //判断键盘输入是1，
        if(1==scanner.nextInt()){
            System.out.println("1");
        }

       //实例化 Zneibu类的引用指向 本类
        Zneibu zc=new Zneibu();
        //调用本类方法
        zc.chushihua();
        zc.xianshi();
        zc.zuche();


    }
}
