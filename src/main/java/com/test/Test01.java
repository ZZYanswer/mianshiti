package com.test;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author: zzy
 * @Time: 3:13 2020/8/12
 * @Description:入参50万个随机整数 返回10万个随机整数。
 */
public class Test01 {

    public static void main(String[] args) {
        int n = 500000;
        int[] item = new int[n];

        for (int i = 0; i < n; i++){
            item[i] = i;
        }

        Random random = new Random();
        for(int i = 0; i < n; i++){
            int m = random.nextInt(n - i) + i;
            int k = item[m];
            item[m] = item[i];
            item[i] = k;
        }

        int[] result = result(item);
        System.out.println(Arrays.toString(result));

    }

    /**
     * 返回10万个随机整数
     * @param item
     * @return res
     */
    public static int[] result(int[] item){
        int n = 100000;
        int[] res = new  int[n];

        for(int i = 0; i < n; i++){
            res[i] = item[i];
        }
        return res;
    }
}
