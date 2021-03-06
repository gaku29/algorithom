package com.gaku.algorithm.string;

/**
 * 整数转罗马数字
 *https://leetcode-cn.com/problems/integer-to-roman/
 */
public class Int2Roman {



    public String intToRoman(int num) {

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C","XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length && num >= 0; i++){

            while (values[i] <= num){
                num -= values[i];
                sb.append(symbols[i]);
            }

        }

        return sb.toString();
    }
}
