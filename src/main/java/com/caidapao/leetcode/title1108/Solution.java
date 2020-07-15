package com.caidapao.leetcode.title1108;
/**
 * Created by caidapao on 2019/7/26
 * Time 21:31
 * address https://today.caidapao.com
 */
public class Solution {
    /**
     * 直接使用造好的轮子
     */
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
