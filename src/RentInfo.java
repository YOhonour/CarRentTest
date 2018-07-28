import java.util.Scanner;

public  class RentInfo {

    private double n;//每次键盘输入的数
    private Scanner scan = new Scanner(System.in);
    private int[] rentNum = new int[8];//租车数量
    private int[] rentDays = new int[8];//租车天数
    private Car[] cars = CarInfo.getCarInfo().getCars();//获取车信息类中的car数组

    public void setRentNum()//输入车的租用数量
    {
        for(int i = 0;i < 8;i ++){
            int k = i+1;
            System.out.println("请输入序号"+k+"("+cars[i].name+")"+"的租用数量");
            n = scan.nextDouble();
            if(n<0 || (n!=(long)n))//判断符数或小数
            {
                System.out.println("不能为负数或小数！");
                n = scan.nextDouble();
            }
            rentNum[i] = (int)n;
        }
    }
    public void setDays()//按照租车数输入租车天数
    {
        for(int i = 0;i < 8;i ++){
            if(rentNum[i] == 0)
            {
                rentDays[i] = 0;
                continue;
            }
            System.out.println("请输入租用"+cars[i].name+"的天数");
            n = scan.nextDouble();
            if(n<0 || (n!=(long)n))
            {
                System.out.println("不能为负数或小数！");
                n = scan.nextDouble();
            }
            rentDays[i] = (int)n;
        }
    }

    public int[] getRentNum() {
        return rentNum;
    }//对外提供租车数组

    public int[] getRentDays() {
        return rentDays;
    }//对外提供租用天数数组


}
