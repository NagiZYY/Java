package com.heima.Test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你买的电影票的序号：");
        int ticket = sc.nextInt();
        if (ticket >= 1 && ticket <= 100){
            if (ticket % 2 ==0){
                System.out.println("坐右边");
            }else {
                System.out.println("做左边");
            }
        }
        System.out.println("你的票是假的");
    }
}
