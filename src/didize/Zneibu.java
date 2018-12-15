package didize;

import java.util.Scanner;

public class Zneibu {
    //初始化数组，开辟数据空间
   private Car[] car= new Car[6];

   void chushihua(){
       car[0]=new ZaikCar(1,"奥迪A4",5,301);
       car[1]=new ZaikCar(2,"奥迪A6",5,402);
       car[2]=new ZaikCar(3,"奥迪A7",5,503);
       car[3]=new ZaikCar(4,"奥迪A7",5,104);
       car[4]=new HuocheCar(5,"东风8",70,705);
       car[5]=new Car(6,"猛禽皮卡",6,30,1006);

   }
   void xianshi() {
       System.out.println("可租用相关车辆信息！");
       for (Car s : car) {
           System.out.println(s);
       }
   }
   void zuche(){
       int i=0;

       Scanner scan=new Scanner(System.in);
       //输入租车数量
       System.out.println("输入租车数量");
       i=scan.nextInt();
       //定义数组初始化并开辟内存空间为i
       int [] scan3=new int [i];
       //依次输入租车对应的型号
       //Scanner scan2=new Scanner(System.in);
       for(int j=0;j<i;j++){

           System.out.print("输入第"+(j+1)+"辆车");
           scan3 [j] =scan.nextInt()-1;
       }
       //输入租车天数
       System.out.println("输入租用天数");
       int day=scan.nextInt();
       //输入租车账单
       zaike(scan3);
       zaihuo(scan3);
       sedzuce(day,scan3);
   }
   void sedzuce(int day,int scan3 []){
       int qian=0;
       for (int i=0;i<scan3.length;i++){
           qian += car[scan3[i]].jiage;

       }
       System.out.println("=======当前总用"+day+"天，总金额为："+qian+"元=======");
   }
   void  zaike(int[] scan5){
        int zke=0;
        for(int i=0;i<scan5.length;i++){
            if (car[scan5[i]].zaike==0)continue;
            zke+=car[scan5[i]].zaike;
        }
       System.out.println("可载客"+zke+"人");
   }
   void zaihuo(int scan6[]){
       int zaihuo=0;
       for(int i=0;i<scan6.length;i++){
           if(car[scan6[i]].zaihuo==0)continue;
           zaihuo+=car[scan6[i]].zaihuo;
       }
       System.out.println("总载货量"+zaihuo+"吨");
   }
}
