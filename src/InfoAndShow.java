/**
 * 本类的作用是记录并显示租用的数据
 *
 * */


import java.util.Scanner;

public class InfoAndShow {

    private int[] rentNums;//租用数量
    private int[] rentDays;//租用天数
    private Car[] cars = CarInfo.getCarInfo().getCars();//接收car数组
    private int rentedCarNum;//租用车辆总数
    private int rentDay;///租用天数总数
    private int peopleNum;//所有租用车的最大载人数
    private int cost;//费用
    private double tonsOfAll;//总载重
    public void init(int[] rentNums,int[] rentDays)//接收租用的数量、天数数组初始化总天数、人数等成员变量
    {
        this.rentNums = rentNums;
        this.rentDays = rentDays;
        rentedCarNum = getAll(rentNums);
        rentDay = getAll(rentDays);
        peopleNum = getAllPeopleNum();
        cost = getFees();
        tonsOfAll = getAllTons();
    }
    private int getAll(int[] array)//int数组求和
    {
        int n = 0;
        for(int i = 0;i < 8;i ++)
            n = n + array[i];
        return n;
    }
    private double getAllTons()//double数组求和
    {
        double n = 0;
        for(int i = 0;i < 8;i++)
            n += rentNums[i]*cars[i].capacityByTon;
        return n;
    }
    private int getAllPeopleNum()//使用租车数数组和car数组计算总载人数
    {
        int n = 0;
        for(int i = 0;i < 8;i++)
            n += rentNums[i]*cars[i].capacityOfMan;
        return n;
    }
    private int getFees()//使用租车数数组、租用天数数组和car数组计算总费用
    {
        int c = 0;
        for(int i = 0;i < 8;i ++){
            if(rentNums[i] == 0)
                continue;
            c += rentDays[i]*rentNums[i]*cars[i].feePerOneDay;
        }
        return c;
    }
    private void showCarsNum()//以租用数量判断是否显示车辆即数量
    {
        for(int i = 0;i < 8;i++){
            if(rentNums[i] == 0) continue;
            System.out.println(cars[i].name+"："+rentNums[i]+" 辆");
        }
    }
    public void show()//打印信息
    {
        System.out.println("总体租车最大载人数："+peopleNum);
        System.out.println("总体租车最大载货量(吨)："+tonsOfAll);
        System.out.println("总体租车费用："+cost);
        System.out.println("租车天数："+rentDay);
        System.out.println("租用车总数："+rentedCarNum);
        showCarsNum();
        Scanner scanner = new Scanner(System.in);//使用回车结束程序
        scanner.hasNextLine();
    }
}
