import java.util.Scanner;

public class Lv1 {
    public static void main(String[] args) {
        int[] arr1 = {15, 25, 10, 30, 40, 20, 50};
        arr1 = sort(arr1);
        System.out.println("冒泡排序后的结果");
        output(arr1);
        System.out.println("请输入一个待插入的数：");
        Scanner scanner = new Scanner(System.in);
        int insertNumber = scanner.nextInt();
        int[] arr2 = {15, 25, 10, 30, 40, 20, 50, insertNumber};
        System.out.println("插入数字" + insertNumber + "后的数组为：");
        output(sort(arr2));
    }

    /**
     * 为数组排序
     *
     * @param arr 待排序的一个数组
     * @return 返回排序好的数组
     */
    static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * 输出这个数组
     *
     * @param arr 传入一个待输出的数组
     */
    static void output(int[] arr) {
        for (int i :
                arr) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }
}
