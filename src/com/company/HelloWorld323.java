package com.company;

public class HelloWorld323 {
    public static void main(String[] args) {
        String filename="Helloimooc.java";
        String email="ceshi@sf-express.com";

        int indx=filename.lastIndexOf('.');
        String cha=filename.substring(indx+1,filename.length());
        if(indx>0&&cha.equals("java")){
            System.out.println("文件名正确");
            System.out.println("文件名后戳："+cha);
        }else{
            System.out.println("文件名错误");
        }

        int emIndx=email.lastIndexOf("@");
        int dIndx=email.lastIndexOf(".");
        if(emIndx<dIndx&&emIndx!=0){
            String em=email.substring(emIndx+1,email.length());
            System.out.println("邮箱格式正确，后戳为:"+em);
        }else{
            System.out.println("邮箱格式错误");
        }
    }
}
