import java.util.Scanner;

public class btvnbuoi4 {
    //    Tinh tong array
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tinh tong array");
        System.out.println("Nhap so dong: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so cot: ");
        int col = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhap so o dong " + (i + 1) + " cot " + (j + 1) + ": ");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int sum = sumAll(row, col, arr);
        System.out.println("Tong cac phan tu trong ma tran la: " + sum);
        mat(scanner);
    }

    public static int sumAll(int row, int col, int[][] arr) {
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    //    Tinh tong 2 ma tran
    public static void mat(Scanner scanner) {
        System.out.println("Tinh tong ma tran");
        System.out.println("Nhap so dong ma tran 1: ");
        int row1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so cot ma tran 1: ");
        int col1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so dong ma tran 2: ");
        int row2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so cot ma tran 2: ");
        int col2 = Integer.parseInt(scanner.nextLine());
        int[][] arr1 = new int[row1][col1];
        int[][] arr2 = new int[row2][col2];
        if (row1 == row2 && col1 == col2) {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    System.out.println("Nhap so ma tran 1 hang " + (i + 1) + " cot " + (j + 1) + ":");
                    arr1[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.println("Nhap so ma tran 2 hang " + (i + 1) + " cot " + (j + 1) + ":");
                    arr2[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }
        } else {
            System.out.println("Khong the thuc hien");
        }
        sumMat(row1, col1, arr1, arr2);
    }

    public static void sumMat(int row1, int col1, int[][] arr1, int[][] arr2) {
        int[][] sum = new int[row1][col1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
