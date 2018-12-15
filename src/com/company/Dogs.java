package com.company;

import java.util.Objects;

public class Dogs  extends Animal31{
    int age =11;
    //重写toString类
    @Override
    public String toString() {
        return "Dogs{" +
                "age=" + age +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    //重写equals类来比较类属性 和类的属性
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dogs dogs = (Dogs) o;
        return age == dogs.age;
    }

    @Override
    public int hashCode() {

        return Objects.hash(age);
    }
    //重写dos类
    public Dogs(){

        super();
        System.out.println("Dogs类执行了！");
    }
    public void method(){
        System.out.println(super.age);
    }
}

