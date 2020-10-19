package Lv3;

class Canteen {
    String canteenName = "国民饭店";

    void paymentMethod() {
        System.out.println("1.支付宝");
        System.out.println("2.微信");
        System.out.println("3.人脸识别");
    }

    void welcome() {
        System.out.println("欢迎来到" + getCanteenName() + "，这是今天的菜单：");
    }

    public String getCanteenName() {
        return canteenName;
    }
}
