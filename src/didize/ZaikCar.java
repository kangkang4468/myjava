package didize;
//定义子类 载客车  继承父类Car
public class ZaikCar extends Car {
    ZaikCar(int bianhap, String name, int zaike,  int jiage) {
        super(bianhap, name, zaike, 2, jiage);
    }
    public String toString(){

        return bianhao+".\t"+name+"\t"+zaike+"人次.\t"+jiage+"元/每天";
    }

}
