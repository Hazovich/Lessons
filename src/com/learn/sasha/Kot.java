package com.learn.sasha;

import java.util.Arrays;

public class Kot {

    public static void main(String sashaHUI[]) {

        int count = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : arr) {
            if(x % 2 == 0) arr[count] = x + 1;
            count++;
        }

        System.out.println(Arrays.toString(arr));
    }
}

