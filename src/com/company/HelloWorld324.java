package com.company;

public class HelloWorld324 {
    public static void main(String[] args) {
        String str = "JAVA 编程";
        System.out.println("转换成小写："+str.toLowerCase());
        System.out.println("获取索引6位置的字符："+str.charAt(6));
        byte [] b=str.getBytes();
        for (int i=0;i<b.length;i++){
            System.out.print(b[i]);
        }

        String ste="adstegfsdhretuytiyjvjrtwersdfafasdfrhg";
        byte [] c=ste.getBytes();
        int byc='a';
        int sum=0;
        for(int j=0;j<c.length;j++){
            if (c[j]==byc) {
                sum+=1;}
        }
        System.out.println("一共有："+sum+"个a字母");

        int sun=0;
        for(int f=0;f<ste.length();f++){
            if (ste.charAt(f)=='f')sun+=1;
        }
        System.out.println("ste字符串有："+sun+"个f字母");
    }
}
