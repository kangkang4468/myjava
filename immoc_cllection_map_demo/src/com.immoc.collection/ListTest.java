
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
创建类
 */
public class ListTest {
    //创建一个List类型的参数， 备选课程
    public List courseToSelect;
    //创造一个参数
    public ListTest(){
        //初始化备选课程courseToSelect,使用ArrayList的实现类
        this.courseToSelect = new ArrayList();

    }
    //创建课程添加到备选课程
    public void TestAdd(){
        //创建课程实例
        Course cr1 = new Course("1","数学");
        Course cr2 = new Course("2","英文");
        //list方法到备选课程序列中
        courseToSelect.add(cr1);
        courseToSelect.add(1,cr2);
        Course [] course = {new Course("3","数据结构"),new Course("4","高等数学")};
        //从序列中取出
        Course temp = (Course) courseToSelect.get(0);
        Course temp2 = (Course) courseToSelect.get(1);
        System.out.println("备选课程："+temp.id+"."+temp.name);
        System.out.println("备选课程："+temp2.id+"."+temp2.name);
        courseToSelect.addAll(Arrays.asList(course));
        Course temp3 = (Course) courseToSelect.get(2);
        Course temp4 = (Course) courseToSelect.get(3);
        System.out.println("备选课程："+temp3.id+"."+temp3.name);
        System.out.println("备选课程："+temp4.id+"."+temp4.name);

        Course [] course2 = {new Course("5","C语言"),new Course("6","Java")};
        courseToSelect.addAll(2,Arrays.asList(course2));
        Course temp5 = (Course) courseToSelect.get(2);
        Course temp6 = (Course) courseToSelect.get(3);
        System.out.println("备选课程："+temp5.id+"."+temp5.name);
        System.out.println("备选课程："+temp6.id+"."+temp6.name);

    }
/*
    显示当前备选课程list中的课程

 */
    public void  testGet(){
        int size = courseToSelect.size();
        System.out.println("当前备选课程有：");
        for (int i = 0;i<size;i++){
            Course cr   = (Course) courseToSelect.get(i);
            System.out.println(""+cr.id+"."+cr.name);
        }
    }
    public static void main(String[] args) {
        ListTest lt = new ListTest();
        lt.TestAdd();
        lt.testGet();
    }
}
