public class Main {
    public static void main(String[] args) {
        CarInfo carInfo = CarInfo.getCarInfo();//获取车信息对象
        carInfo.show();//打印车的信息
        RentInfo rentInfo = new RentInfo();//实列化租用信息对象
        rentInfo.setRentNum();//设置天数
        rentInfo.setDays();//设置数量
        InfoAndShow infoAndShow = new InfoAndShow();//实例化数据总结对象
        infoAndShow.init(rentInfo.getRentNum(),rentInfo.getRentDays());//使用租用信息的租用数量、天数数组初始化总结对象
        infoAndShow.show();//打印总结信息
    }
}
