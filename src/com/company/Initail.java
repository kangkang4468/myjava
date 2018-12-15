package com.company;

public class Initail {

    public static void main(String[] args) {
        //对象的多态
        Animal41 obj1 = new Animal41();
        Animal41 obj2 =new Dogs2();//父类对象可以指向子类对象
        Animal41 obj4 = new Cat();
        //Dogs2 obj3 = new Animal41();   子类对象不能指向父类对象
        obj1.eat();
        obj2.eat();
        obj4.eat();

        //类型的转换
        Dogs2 dog5 = new Dogs2();
        Animal41 animal2 =dog5;//类型可以向上转换 自动转换类型
        if (animal2 instanceof Dogs2) {
            Dogs2 dog6 = (Dogs2) animal2;//向下转转类型，强制转换类型
        }else System.out.println("不能强制转换Dogs2类型");
        if (animal2 instanceof Cat){
        Cat cat =(Cat) animal2;
        }else System.out.println("不能强制转换Cat类型");

    }
}
