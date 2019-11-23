package com.lanqiao.t332;

import java.util.*;

public class Main {

    //1 5744 9359 3545
    public static void main(String[] ars) {
        long alltime = 10*10000*10000*10000;
        System.out.println("start time:\t" + System.currentTimeMillis());
        int sum = 0;
        int num = 0;
        for (int i = 1; i < alltime; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
            num++;
        }
        System.out.println("loop time:\t" + num);
        System.out.println("result:\t" + sum);
        System.out.println("end time:\t" + System.currentTimeMillis());

        System.out.println("start time:\t" + System.currentTimeMillis());
        int x = 1;
        int y = 0;
        int n = 0;
        while (x * 3 < alltime) {
            y += x * 3;
            x++;
            n++;
        }
        x = 0;
        while (x * 5 < alltime) {
            if (x * 5 % 3 == 0) {
                x++;
                n++;
                continue;
            }
            y += x * 5;
            x++;
            n++;
        }
        System.out.println("loop time:\t" + n);
        System.out.println("result:\t" + y);
        System.out.println("end time:\t" + System.currentTimeMillis());
    }

}
