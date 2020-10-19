package Lv3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int dishesNum = 5;
        int priceSum = 0;
        //该数组用来保存选择好的选项
        int[] selectedDashes = {100, 100, 100, 100, 100};

        //初始化canteen，打印出欢迎
        Canteen canteen = new Canteen();
        canteen.welcome();

        //初始化成员对象数组，给每个数组赋值
        Dishes[] dishes = new Dishes[dishesNum];
        dishes[0] = new Dishes("辣子鸡丁", 38, 1);
        dishes[1] = new Dishes("水煮肉片", 22, 2);
        dishes[2] = new Dishes("糖醋里脊", 18, 3);
        dishes[3] = new Dishes("干锅牛肉", 38, 4);
        dishes[4] = new Dishes("干锅排骨", 29, 5);

        printMenu(dishes);
        System.out.println("请输入想点的菜和序号：");

        //读入数据
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        Scanner scannerToArray = new Scanner(temp);

        //获取输入的单号值，保存选中的选项
        while (scannerToArray.hasNextInt()) {
            selectedDashes[i] = scannerToArray.nextInt();
            i++;
        }

        //确认选择
        System.out.println("你一共选择了：");
        for (int j :
                selectedDashes) {
            switch (j) {
                case 1:
                    priceSum = priceSum + confirmItem(dishes[0]);
                    break;
                case 2:
                    priceSum = priceSum + confirmItem(dishes[1]);
                    break;
                case 3:
                    priceSum = priceSum + confirmItem(dishes[2]);
                    break;
                case 4:
                    priceSum = priceSum + confirmItem(dishes[3]);
                    break;
                case 5:
                    priceSum = priceSum + confirmItem(dishes[4]);
                    break;
                case 100:
                    break;
                default:
                    System.out.println("你输入一个值可能无效，请尝试重新输入");
            }
        }
        System.out.println("共计" + priceSum + "元");

        canteen.paymentMethod();
        //读取支付方式
        Scanner paymentScanner = new Scanner(System.in);
        int paymentWay = paymentScanner.nextInt();

        //打印支付信息
        switch (paymentWay) {
            case 1, 2, 3 -> pay();
            default -> System.out.println("支付不成功，请重试");
        }
    }

    /**
     * 打印菜单，这里打印全部菜单
     *
     * @param dishes 传入所有菜单
     */
    static void printMenu(Dishes[] dishes) {
        for (Dishes i :
                dishes) {
            System.out.println(i.getDishNumber() + "、" + i.getDishName() + " " + i.getDishPrice() + "元");
        }
    }

    /**
     * 打印全部选定的菜品
     *
     * @param dishes 传入一个菜品对象
     * @return 返回该菜的价钱
     */
    static int confirmItem(Dishes dishes) {
        int price = 0;
        price = dishes.getDishPrice();
        System.out.println(dishes.getDishName() + "  " + dishes.getDishPrice() + "元");
        return price;
    }

    /**
     * 提示出示付款码
     */
    static void pay() {
        System.out.println("请出示付款码...");
    }
}
