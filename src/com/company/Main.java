package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Bt9 bt9 = new Bt9();
        BT10 bt10 = new BT10();

        System.out.println("**-----------------------------------------**");

        System.out.println("Nhập số 1 - Bài 9 : In ra hình tam giác");
        System.out.println("Nhập số 2 - Bài 10 : In ra hình chữ nhật");

        System.out.println("\nNhập -1 để thoát chương trình");

        int number = -1;
        do {
            System.out.print("\nBạn muốn giải bài tập số: ");
            number = scanner.nextInt();
            if (number != -1) {
                switch (number) {
                    case 1:
                        bt9.giaiBT9();
                        break;
                    case 2:
                        bt10.giaiBT10();
                        break;
                    default:
                        System.out.println("Không có bài tập này. Hãy chọn từ 1 -> 4");
                        System.out.println("Nhập -1 để thoát chương trình");
                        break;
                }
            }
        } while (number >= 0);
    }
}