package com.heima.Test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //回文数判断

        //获取一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int x = sc.nextInt();
        //定义暂存x数值的临时数，用于最后的比较
        int tep = x;
        //定义新数字
        int num = 0;
        //拆分x
        while (x != 0){
            //取最右边的数字
            int ge = x % 10;
            x = x / 10;
            //组装新数字
            num = num * 10 + ge;
        }
        System.out.println("输入数字的反数为：" + num);
        System.out.println("x的值最后为：" + x);
        System.out.println("输入数字是否为回文数：" + (num == tep));
    }
}
