package com.caidapao.leetcode.title665;
/**
 * 665. Non-decreasing Array
 * 665. 非递减数列
 * Created by caidapao on 2019/9/19
 * Time 20:52
 * address https://today.caidapao.com
 * @author caix01
 */
public class My665 {

    public static void main(String[] args) {
        int[] a = new int[]{2, 3, 3, 2, 4};
        new My665().checkPossibility(a);
    }

    int tempIndex = 0;

    public boolean checkPossibility(int[] nums) {
        if (nums.length <= 2) {
            return true;
        }
        //如果0次a[i+1] > a[i],则为true
        int decrementTimes = getDecrementTimes(nums);
        if (decrementTimes == 0) {
            return true;
        }
        //如果一次以上的a[i+1] > a[i],则为false
        if (decrementTimes > 1) {
            return false;
        }
        //将开始递减的下标存起来
        int index = tempIndex;
        //只有一次的情况下。将a[i] 赋值给 a[i+1] 或者 a[i+1] 赋值给 a[i],再检查 getWrongTimes 是否为0即可
        int a = nums[index];
        int b = nums[index + 1];
        //1.a[i] = a[i+1]
        nums[index] = b;
        if (getDecrementTimes(nums) == 0) return true;
        //2.a[i+1] = a[i]
        nums[index + 1] = a;
        nums[index] = a;
        return getDecrementTimes(nums) == 0;
    }

    /**
     * 获取这个数组中递减的次数，例如{5,2,3,1,1,0}  递减的次数为三 (5>2 3>1 1>0)
     * @param nums 数据
     * @return 递减的次数
     */
    private int getDecrementTimes(int[] nums) {
        int counts = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i + 1] < nums[i]) {
                counts++;
                tempIndex = i;
            }
        }
        return counts;
    }

}
