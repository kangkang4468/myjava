package com.immoc.collection;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
    /*
    创建一个泛型的 Course属性的课程类courses
     */
    public List<Course> courses;
    public Map<String,Student> students;
    /*
    重新构造方法，使用ArrayList方法初始化
     */
    public  TestGeneric() {
        this.courses = new ArrayList < Course >();
    }
    //list的Add方法
    public void testAdd(){
        Course cr = new Course("1","大学语文");
        courses.add(cr);
        Course cr2 = new Course("2","Java");
        courses.add(cr2);
    }
    //循环遍历
    public void testForEach(){
        for (Course cr:courses){

            System.out.println(cr.id+"."+cr.name);
        }
    }
    public void testChild(){
        ChildCourse ccr = new ChildCourse();
        courses.add(ccr);
    }
    /*
    泛型不能使用基本类，除非使用其包装类
     */
    public void testBasicTepy(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        System.out.println("基本类型的包装类");
        System.out.println(list.get(0));
    }
    /*
    main函数
     */
    public static void main(String[] args) {
       TestGeneric tg = new TestGeneric();
       tg.testAdd();
       tg.testForEach();
       tg.testBasicTepy();
    }
}
