package com.company;

import  java.lang.String;
import java.util.Scanner;

public class lab4_var2 {
    public static void main(String[] args) {
        int a;
        int b;
        int max = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество столбцов массива: ");
        a = in.nextInt();

        System.out.print("Введите количество строк массива: ");
        b = in.nextInt();


        int[][] arr = new int[a][b];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                arr[i][j] = in.nextInt();
            }
        }
        in.close();

        boolean find = true;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i][arr.length - i - 1];
            if (temp % 2 == 0) {
                if (find) {
                    max = temp;
                    find = false;
                } else if (temp > max) {
                    max = temp;
                }
            }
        }
        System.out.println(find ? "Nothing" : max);

        int x = 4, y = 0;
        System.out.print("Побочная диагональ: ");
        while (x > -1 && y < 5) {
            System.out.print(arr[y][x] + "\t");
            x--;
            y++;
        }
    }
}