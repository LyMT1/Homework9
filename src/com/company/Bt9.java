package com.company;

import java.util.Scanner;

public class Bt9 {

    public void giaiBT9() {
        int height;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào chiều cao của hình tam giác: ");
            height = scanner.nextInt();
            if (height <= 0) {
                System.out.println("Hãy nhập chiều cao > 0");
            } else if (height == 1) {
                System.out.println("Chưa tạo thành tam giác");
            }
        } while (height <= 1);
        inTamGiac(height);
    }

    public void inTamGiac(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = height - i; j > 1; j--) {
                System.out.print("   ");
            }

            for (int j = 0; j <= 2 * i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    }