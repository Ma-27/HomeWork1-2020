import java.util.Random;
import java.util.Scanner;

public class Lv2 {
    public static void main(String[] args) {
        int lineNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请为对称矩阵输入行数：");
        lineNumber = scanner.nextInt();

        int[][] matrixA = new int[lineNumber][lineNumber];
        int[][] matrixB = new int[lineNumber][lineNumber];
        int[][] multipliedMatrix;

        matrixA = assignment(matrixA);
        matrixB = assignment(matrixB);

        System.out.println("随机对称矩阵A：");
        output(matrixA);
        System.out.println("随机对称矩阵B：");
        output(matrixB);

        System.out.println("相乘后的对称矩阵：");
        multipliedMatrix = matrixMultiple(matrixA, matrixB);
        output(multipliedMatrix);

        System.out.println("此矩阵的对角线之和为：" + diagonalSum(multipliedMatrix));
    }

    /**
     * 用随机数对矩阵赋值
     * 注意：这里将随机数范围限定在了99，可以改动
     *
     * @param matrix 一个未初始化的矩阵
     * @return 赋值随机数的矩阵
     */
    static int[][] assignment(int[][] matrix) {
        //限定随机数范围，可更改
        final int bound = 9;

        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //这里将随机数限定在999
                matrix[i][j] = random.nextInt(bound);
            }
        }
        return matrix;
    }

    /**
     * 将矩阵打印到屏幕上
     *
     * @param matrix 传入一个需要打印的二维数组
     */
    static void output(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                //输出数组
                System.out.print(anInt);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    /**
     * 矩阵乘法运算
     *
     * @param matrix1 第一个要相乘的矩阵
     * @param matrix2 第二个要相乘的矩阵
     * @return 返回一个计算好的矩阵
     */
    static int[][] matrixMultiple(int[][] matrix1, int[][] matrix2) {


        int[][] matrixnew = new int[matrix1.length][matrix2.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                int t, sum = 0;

                for (t = 0; t < matrixnew.length; t++) {
                    sum = sum + matrix1[i][t] * matrix2[t][j];
                }
                matrixnew[i][j] = sum;
            }
        }
        return matrixnew;
    }

    /**
     * 计算矩阵对角线元素的和
     *
     * @param matrix 传入一个待计算的矩阵
     * @return 返回int型对角线和
     */
    static int diagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sum = sum + matrix[i][j];
                }
            }
        }
        return sum;
    }
}
