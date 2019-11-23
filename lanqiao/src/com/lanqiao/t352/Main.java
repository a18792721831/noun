package com.lanqiao.t352;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long in = scanner.nextLong();
        String out = "";
        for (int i = 10; i > 0; i--) {
            long x = in / getj(i);
            out += (x + (10 - i) > 9 ? 10 - (x + (10 - i))%9 : (x + (10 - i)));
        }
        System.out.println(out);

    }

    private static long getj(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
