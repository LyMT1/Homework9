package com.company;

import java.util.Scanner;

public class BT10 {

    public void giaiBT10() {
        int height, width;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập chiều cao của hình chữ nhật: ");
            height = scanner.nextInt();
            if (height <= 0) {
                System.out.println("Hãy nhập chiều cao > 0");
            }

            System.out.println("Nhập chiều rộng của hình chữ nhật: ");
            width = scanner.nextInt();
            if (width <= 0) {
                System.out.println("Hãy nhập chiều rộng > 0");
            }
        } while (height <= 0 || width <= 0);
        inHinhChuNhat(height, width);
    }

    public void inHinhChuNhat(int height, int width) {
        for (int i = 0; i < height; i++) {
            System.out.println();
            for (int j = 0; j < width; j++) {
                System.out.print(" * ");
            }
        }
    }
}
