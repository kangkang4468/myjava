package didize;
//定义子类  货车类 继承父类 Car
public class HuocheCar extends Car {
    //把参数传入
    HuocheCar(int bianhap, String name, int zaihuo, int jiage) {
        super(bianhap, name,0, zaihuo, jiage);
    }
    //重写父类toSting方法
    public String toString(){
        return bianhao+".\t"+name+"\t"+zaihuo+"吨.\t"+jiage+"元/每天";
    }
}
