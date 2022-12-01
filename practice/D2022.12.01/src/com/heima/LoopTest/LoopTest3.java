package com.heima.LoopTest;

import java.util.Scanner;

public class LoopTest3 {
    //键盘录入一个正整数x，判断该整数是否为一个质数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int number = sc.nextInt();
        //循环：从2开始，到number - 1结束
        //判断：这一范围内有没有数字可以被number整除

        /*for (int i = 2; i < number; i++) {
            if (number % i == 0){
                System.out.println(number + "不是质数");
                break;
            }
        }
        System.out.println(number + "是质数");*/


        //定义一个变量，表示标记
        //标记着number是否为一个质数

        //表示最初默认为number是一个质数
        boolean flag = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                flag = false;
                //System.out.println(number + "不是质数");
                break;
            }
        }
        if (flag){
            System.out.println(number + "是一个质数");
        }else{
            System.out.println(number + "不是一个质数");
        }
    }
}
