package com.yhtian.springboot.service;

/**
 * @author: yhtian
 * @date: 2021/02/23
 * @description:
 */
public class mao {

    /**
     * 冒泡排序
     * */
    public static int[] maopao(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -1 -i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int k = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = k;
                }
            }
        }

        for (int m = 0; m < arr.length; m ++) {
            System.out.println(arr[m]);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] a = {8, 1, 3, 2, 6, 7, 9, 5};
        maopao(a);
    }
}
