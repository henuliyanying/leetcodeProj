package com.edu.leetcode;

/**
 * @author
 * @version 1.0
 * @team 魔法城堡
 * 此函数功能是给定一个数组，再给定下标范围，求此范围内的数组的和
 * 但是是分两个函数的，一个是有参构造函数；另一个是传入数组下标范围
 * @date 2021/9/20 8:56
 */
public class RangeArraySum {

    int[] sums;

    public RangeArraySum(int[] nums){
        int len = nums.length;
        sums = new int[len+1];
        for (int i = 0; i < len; i++) {
            //每加一个num[i]，就要存入到sum中，
            //sum[i] 存的是：包含下标为i-1及其之前的和
            sums[i+1] = sums[i] + nums[i];
        }
    }

    public int sunRange(int left,int right){
        return sums[right+1] - sums[left];
    }


}
