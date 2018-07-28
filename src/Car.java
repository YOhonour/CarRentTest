/**
本类用于定义车的基本属性
 */
public class Car
{
    int number;
    String name;
    int feePerOneDay;
    int capacityOfMan;
    double capacityByTon;
    Car(){
        /**
         * 构造函数中初始化载人数，载重的初始状态        *
         * */
        capacityOfMan = 0;
        capacityByTon = 0;
    }
}
