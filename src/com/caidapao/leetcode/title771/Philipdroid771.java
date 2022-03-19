package com.caidapao.leetcode.title771;

/**
 * 搬运过来的，大佬力扣账号是：philipdroid
 * 利用了ASCII表和字符的对应关系（我怎么就想不到呢..）
 */
public class Philipdroid771 {

    public static void main(String[] args) {
        new Philipdroid771().numJewelsInStones("aAb", "aAAbbbb");
    }

    public int numJewelsInStones(String J, String S) {
        if (S == null || S.isEmpty()) return 0;
        if (J == null || J.isEmpty()) return 0;

        byte[] arr = new byte[58];
        int count = 0;
        for (char ch : J.toCharArray()) {
            arr[ch - 65] = 1;
        }
        for (char ch : S.toCharArray()) {
            if (arr[ch - 65] == 1) {
                count++;
            }
        }
        return count;
    }
}
