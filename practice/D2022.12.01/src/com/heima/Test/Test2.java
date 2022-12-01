package com.heima.Test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //在一定范围内被3或5整除的数字有几个
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始范围：");
        int start = sc.nextInt();
        System.out.println("请输入结束范围：");
        int end = sc.nextInt();


        int count = 0;


        for (int i=start;i<=end;i++){
            if (i % 3 ==0 && i % 5 ==0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
