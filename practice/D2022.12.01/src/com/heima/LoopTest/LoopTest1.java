package com.heima.LoopTest;

public class LoopTest1 {
    public static void main(String[] args) {
        //逢七过
        //游戏规则：从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍数时都要说：过
        //使用程序在控制台打印出1-100之间的满足逢七必过规则的数据
        for (int i = 1; i <= 100; i++){
            if (i % 7 == 0 || i % 10 == 7 || i / 10 % 10 == 7){
                System.out.println("过");
                //跳过本次循环，直接执行下一次循环
                continue;
            }
            System.out.println(i);
        }
    }
}
