package com.edu.leetcode;


/**
 * @author
 * @version 1.0
 * @team 魔法城堡
 * @date 2021/9/28 10:39
 */
//  寻找0~n-1中缺失的数字
// 数组是排好序的
public class missingNumSolution {
    //原地交换法
    public static int  missingNumber1(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == i){
                continue;
            }else{
                return i;
            }
        }
        return nums.length;
    }
    public static int missingNumber2(int[] nums){
        int low = 0, high = nums.length-1;
        while (low <= high){
            int mid = (low+high)/2;
            //如果中间位置有序，则中间位置的左子数组都是有序的
            if(nums[mid] == mid){
                low = mid+1;
            }else {
                high = mid -1;
            }
        }
        return low;
    }

}
