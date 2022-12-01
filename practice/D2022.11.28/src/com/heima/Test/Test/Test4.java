package com.heima.Test.Test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("第一只老虎的体重：");
        double first = sc.nextDouble();
        System.out.println("第二只老虎的体重：");
        double second = sc.nextDouble();

        String result = first == second ? "相同":"不相同";
        System.out.println(result);
    }
}
