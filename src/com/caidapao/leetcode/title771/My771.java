package com.caidapao.leetcode.title771;
/**
 * 771. Jewels and Stones
 * 771. 宝石与石头
 * 我的瓜皮解答..没啥好说的，暴力的一个个比较
 * Created by caidapao on 2019/7/27
 * Time 17:17
 * address https://today.caidapao.com
 */
public class My771 {

    public static void main(String[] args) {
        new My771().numJewelsInStones("aAb", "aAAbbbb");
    }

    public int numJewelsInStones(String J, String S) {
        if (J.length() == 0 || S.length() == 0) return 0;
        int total = 0;
        for (char c : J.toCharArray()) {
            for (char s : S.toCharArray()) {
                if (c == s)
                    total++;
            }
        }
        return total;
    }

}
