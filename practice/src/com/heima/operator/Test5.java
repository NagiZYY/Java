package com.heima.operator;

public class Test5 {
    public static void main(String[] args) {
        int weight1 =150,weight2=210,weight3=165;
        int temp = weight1 > weight2 ? weight1 : weight2;
        int result = temp > weight3 ? temp : weight3 ;
        System.out.println(result);
    }
}
