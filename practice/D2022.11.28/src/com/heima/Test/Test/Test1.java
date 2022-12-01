package com.heima.Test.Test;


import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("请输入一个三位整数：");
        Scanner sc = new Scanner(System.in);
        int i =sc.nextInt();
        //打印个位
        System.out.println("个位是："+ (i % 10));
        //打印十位
        System.out.println(i / 10 % 10);//！！！
        //打印百位
        System.out.println(i / 100 % 10);

        /*//老师的方法，比较简便
        int number = sc.nextInt();
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number /100 % 10;
        System.out.println("个位是："+ ge);
        System.out.println("十位是："+ shi);
        System.out.println("百位是："+ bai);*/
    }
}
