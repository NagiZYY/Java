package com.heima.Test.Test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("请输入你的时髦度：");
        Scanner sc = new Scanner(System.in);
        int you = sc.nextInt();
        System.out.println("请输入你约会对象的时髦度：");
        int you_date = sc.nextInt();

        boolean result = you > you_date;
        System.out.println(result);
    }
}
