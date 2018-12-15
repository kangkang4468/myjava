package com.company;

public class Inner {
    public static void main(String[] args) {
        //dog方法继承的 Animal方法
        Dogs dog = new Dogs();
        dog.age=22;
        Dogs dogs2 =new Dogs();
        dogs2.age=22;

        dog.name = "STV";
        dog.eat();
        dog.method();
        System.out.println(dog);
        if(dog.equals(dogs2)){
            System.out.println("两个地址相同");
        }else System.out.println("两个值不相同");
    }
}
