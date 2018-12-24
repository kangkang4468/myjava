package com.immoc.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
//     创建一个人Map类型的students的对象 添加泛型<>
    public Map<String,Student> students;

    /**
     * 重构MapTest方法，使用HashMap方法初始化students
     */
    public  MapTest(){

        students = new HashMap<String,Student>();
    }
    /**
     *
     */
    public void StudentAdd(){
        Scanner scanner = new Scanner(System.in);
        int i= 0;

        while(i<3){
            System.out.println("请输入ID：");
            String sc=scanner.next();
            Student st=students.get(sc);
            if (st==null){
                System.out.println("请输出姓名：");
            String name =scanner.next();
            Student newStudents = new Student(sc,name);
            students.put(sc,newStudents);
            i++;
        }else{
            System.out.println("重复ID");}
        }
    }
    public void testKeySet(){
        Set<String> keySet = students.keySet();
        int size= students.size();
        for (String stu:keySet) {
            Student st = students.get(stu);
            System.out.println("编号："+st.id+"姓名："+st.name);
        }
    }
    public static void main(String[] args) {
        MapTest mapt= new MapTest();
        mapt.StudentAdd();
        mapt.testKeySet();
    }

}
