package com.heima.LoopTest;

import java.util.Random;
import java.util.Scanner;

public class LoopTest4 {
    //程序自动生成一个1~100之间的随机数字，使用程序实现猜出这个数字是多少？
    public static void main(String[] args) {

        //保底机制
        //计数器：用来统计猜了多少次
        int count = 0;

        //生成随机数
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        System.out.println(num);
        //键盘录入猜的数字
        Scanner sc = new Scanner(System.in);
        //循环重复猜数
        while (true){
            System.out.println("请输入猜的数字：");
            int guessNumber = sc.nextInt();
            count++;
            //只要猜三次，就出现”猜对了“
            if (count == 3){
                System.out.println("猜对了！");
                break;
            }
            //判断猜的数字与随机数的关系
            if (guessNumber > num){
                System.out.println("大了");
            }else if (guessNumber < num){
                System.out.println("小了");
            }else {
                System.out.println("猜对了！");
                break;
            }
        }

    }
}
