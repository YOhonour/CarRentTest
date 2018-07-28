/**
 * 本类的作用是读取和保存各个车的初始状态,因为车的的种类不同载货量有差别，所以显示的时候使用了不同的内部类实现
 * */


public class CarInfo {
    /**
     * 内部类
     * */
    private class Bus extends Car {
        Bus(int number,String name,int feePerOneDa,int capacityOfMan){
            this.capacityOfMan = capacityOfMan;
            super.feePerOneDay = feePerOneDa;
            super.name = name;
            super.number = number;
        }
        private void show(){
            System.out.println(super.number+"    "+super.name+"       "+super.feePerOneDay+"           "+capacityOfMan);
        }
    }
    private class Truck extends Car {
        Truck(int number,String name,int feePerOneDay,double capacityByTon){
            super.capacityByTon = capacityByTon;
            super.feePerOneDay = feePerOneDay;
            super.name = name;
            super.number = number;
        }
        private void show(){
            System.out.println(super.number+"    "+super.name+"       "+super.feePerOneDay+"           "+capacityByTon);
        }
    }
    private class Pick_up extends Car {
        Pick_up(int number,String name,int feePerOneDay,int capacityOfMan,double capacityByTon){
            this.capacityByTon = capacityByTon;
            this.capacityOfMan = capacityOfMan;
            super.feePerOneDay = feePerOneDay;
            super.name = name;
            super.number = number;
        }
        private void show(){
            System.out.println(super.number+"    "+super.name+"       "+super.feePerOneDay+"           "+capacityOfMan+"           "+capacityByTon);
        }
    }


    /**
     * 初始化车的种类，数据
     *
     * */
    private Bus bus1 = new Bus(1,"小轿车",40,4);
    private Bus bus2 = new Bus(2,"面包车",65,7);
    private Bus bus3 = new Bus(3,"大巴车",180,20);
    private Truck truck4 = new Truck(4,"低栏车",30,1.5);
    private Truck truck5 = new Truck(5,"高栏车",47,2.5);
    private Truck truck6 = new Truck(6,"厢式车",80,4.5);
    private Pick_up pick_up7 = new Pick_up(7,"日式皮卡",60,5,1);
    private Pick_up pick_up8 = new Pick_up(8,"美式皮卡",60,2,3);

    private Car[] cars = {bus1,bus2,bus3,truck4,truck5,truck6,pick_up7,pick_up8};//将初始化的车生成car的数组
    public Car[] getCars() {
        return cars;
    }//对外提供car数组

    /**
     * 使用单例方式，只生成一个车信息的对象对外提供
     * */
    private CarInfo(){}
    private static final CarInfo carInfo = new CarInfo();
    public static CarInfo getCarInfo() {
        return carInfo;
    }

    public void show()//打印车的信息
    {
        System.out.println("载客车");
        System.out.println("序号  车辆名称  租车费用(Y/D)  最大载人(人)");
        bus1.show();
        bus2.show();
        bus3.show();
        System.out.println("载货车");
        System.out.println("序号  车辆名称  租车费用(Y/D)  最大载货(吨)");
        truck4.show();
        truck5.show();
        truck6.show();
        System.out.println("皮卡车");
        System.out.println("序号  车辆名称  租车费用(Y/D)  最大载人(人)  最大载货(吨)");
        pick_up7.show();
        pick_up8.show();
    }


}
