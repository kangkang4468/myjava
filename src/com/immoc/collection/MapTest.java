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
     *put方法添加数据到映射
     */
    public void StudentAdd(){
        Scanner scanner = new Scanner(System.in);
        int i= 0;

        while(i<3){
            System.out.println("请输入ID：");
            String sc=scanner.next();
//            获取student的映射放到sc中
            Student st=students.get(sc);
//            判断映射是否为空
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

    /**
     * 通过ketSet方法迭代遍历 Map数组
     */
    public void testKeySet(){
        Set<String> keySet = students.keySet();
        int size= students.size();
        for (String stu:keySet) {
            Student st = students.get(stu);
            System.out.println("编号："+st.id+"姓名："+st.name);
        }
    }

    /**
     * remove方法删除数据
     * @param args
     */
    public void testRemove(){

        while(true){
            System.out.println("输入需要删除的id号");
            Scanner scan = new Scanner(System.in);
            String ID = scan.next();
            Student st = students.get(ID);
        if (st==null){
            System.out.println("没有对应ID，请重新输入");
           continue;
        }else

        students.remove(ID);
            System.out.println("删除成功！");
        break;
        }
    }

    /**
     * 修改Map中的键值
     * @param args
     */
    public void testModify(){
        Scanner sc= new Scanner(System.in);
//       Set<Map.Entry<String, Student>> entrysets = students.entrySet();
        while(true){
            System.out.println("输入要修改的ID");
        String ID = sc.next();
        Student st = students.get(ID);
        if(st==null) {
            System.out.println("没有此ID的用户，需要重新输入！");
            continue;
        }
        System.out.println("确定修改的ID："+st.id+"要修改的姓名："+st.name);
//        String newID = sc.next();
        String newName = sc.next();
        Student newstudent = new Student(ID,newName);
        students.put(ID,newstudent);
            System.out.println("修改完成"+ID+"。"+newstudent.name);
            break;
     }
    }
    public static void main(String[] args) {
        MapTest mapt= new MapTest();
        mapt.StudentAdd();
        mapt.testKeySet();
        /*mapt.testRemove();
        mapt.testKeySet();*/
        mapt.testModify();
    }

}
