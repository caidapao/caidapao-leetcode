package com.caidapao.leetcode.title88;

/**
 * Time 2022-03-19 23:22
 * Address https://today.caidapao.com
 *
 * @author caidapao
 */
public class Solution88 {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        new Solution88().merge(nums1,m,nums2,n);
        for(int i:nums1){
            System.out.println(i);
        }
    }

    //第一次漏掉的逻辑：如果没有nums2比nums1中所有的元素都要大，直接放nums1中有效值的尾部
    //第二次漏掉的逻辑：直接放nums1中有效值的尾部，要在i+1的位置
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j = 0; j < n; j++){
            for(int i = 0; i < nums1.length ;i++){
                int n1 = nums2[j];
                int n2 = nums1[i];
                if(n1 <= n2) {
                    this.moveBack(nums1, i);
                    nums1[i] = nums2[j];
                    m++;
                    break;
                }else if((i + 1) >= m ){
                    nums1[i+1] = nums2[j];
                    m++;
                    break;
                }
            }
        }
    }

    private void moveBack(int[] nums1,int index){
        if((index + 1)== nums1.length){
            return;
        }
        for(int i = nums1.length -1; i > index ; i--){
            nums1[i] = nums1[i-1];
        }
    }
}
