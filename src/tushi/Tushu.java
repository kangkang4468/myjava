package tushi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tushu {
    String [] mulu=new String[] {"新闻","java","C语言","E英语","自然"};
    public static void main(String[] args) {
        //初始化数组，开辟数据空间，并初始化数组

        Scanner sc=new Scanner(System.in);
        Tushu tushu=new Tushu();
        //try catch 捕获异常，使用catch TushuException 打印出异常
        while (true){
            System.out.println("输入编号进入序列号或者图书名查找");
        try{
            int s=sc.nextInt();
            //判断输入的1还是2 进入找书，其他反馈输入异常
            if (s==1){
                System.out.println("进入1,编号查找，输入编号");
                int bh=sc.nextInt();
                String findbh=tushu.bianhao(bh);
                System.out.println("图书名："+findbh);
                break;
            }else if (s==2){
                System.out.println("进入2,书名查找，输入图书名");
                String name=sc.next();
                String fname=tushu.name(name);
                System.out.println("图书名是："+fname);
                break;
            }else {
                System.out.println("输入数字错误");
            }
        }catch(InputMismatchException e){
            System.out.println("请勿输入非数字");
        } catch (TushuException e) {
            e.printStackTrace();
        }
    }}
    //声明异常，找到编号返回书名，否则提出异常
    public String bianhao(int bh)throws TushuException{

            if (bh<mulu.length) {
                String b=mulu[bh-1];
                return b;
            }else throw new TushuException("编号错误");
    }
    //
    public String name(String name) throws TushuException{
        for (String shu:mulu){
        if (shu.equals(name))
            return name;
            }
            throw new TushuException("找不到图书");

    }
}
