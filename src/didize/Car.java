package didize;


//创建抽象父类 Car
public class Car {
    //定义公共属性
    public  int bianhao;
    public  String name;
    public  int zaike;
    public int zaihuo;
    public double jiage;

    //默认方法，把当前数据传入内部方法
    Car(int bianhap,String name,int zaike,int zaihuo,int jiage){
        this.bianhao=bianhap;
        this.name = name;
        this.zaike =zaike;
        this.zaihuo = zaihuo;
        this.jiage = jiage;
    }
    //重写 to Sting 方法，子类会重构
    public String toString(){
        return bianhao+".\t"+name+"\t"+zaike+"人次.\t"+zaihuo+"吨.\t"+jiage+"元/每天";

    }
}
