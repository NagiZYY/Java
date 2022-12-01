package com.heima.LoopTest;

import java.awt.*;
import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        //键盘录入一个大于等于2的整数x，计算并返回x的平方根。
        //结果只保留整数部分，小数部分被舍去
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数：");
        int num = sc.nextInt();

        //平方根：
        //10
        //1 * 1 = 1 < 10
        //2 * 2 = 4 < 10
        //3 * 3 = 9 < 10
        //4 * 4 = 16 > 10
        //推断：10的平方根在3~4之间。取3。

        for (int i = 1; i <= num; i++) {
            if (i * i == num){
                System.out.println(i + "是" + num + "的平方根");
                //找到后就停止寻找
                break;
            }else if (i * i > num){
                System.out.println((i - 1) + "是" + num + "平方根的整数部分");
                //找到后就停止寻找
                break;
            }
        }
    }
}
