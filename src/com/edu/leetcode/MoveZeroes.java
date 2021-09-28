package com.edu.leetcode;

import java.util.Arrays;

/**
 * @author
 * @version 1.0
 * @team 魔法城堡
 * @date 2021/9/6 10:34
 */
public class MoveZeroes {

    public int[] moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                // 减少赋值的次数
                if (slow != fast) {
                    nums[slow] = nums[fast];
                }
                slow++;
            }
        }
        //for循环
        for (; slow < nums.length; slow++) {
            nums[slow] = 0;
        }
        return nums;
    }



    //双指针实现
    //时间复杂度为o(n)  遍历一遍数组
    //空间复杂度 O(1)
    public int[] moveZeros2(int[] nums){
        if(nums == null || nums.length == 0){
            return new int[]{};
        }
        //下一个非零元素存储的位置
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                //交换i和j指向的元素
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }
        return nums;
    }
    //暴力解法
    //时间复杂度为o(n)
    //空间复杂度O(n) ：初始化了一个数组
    public int[] moveZeros1(int[] nums){
        if(nums == null || nums.length == 0){
            return new int[]{};
        }

        int[] tmp = new int[nums.length];
        //记录tmp数组第一个为0的元素
        int j = 0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] != 0){
                tmp[j] = nums[i];
                j++;
            }
        }
        return tmp;
    }
    //双指针优化空间

    public static void main(String[] args){
        int[] nums = new int[]{0,6,0,3,8,0};
        int[] res = new MoveZeroes().moveZeroes(nums);
        System.out.println(Arrays.toString(res));
    }

    //最好在常量级，最好不需要额外数组,在原有数组上完成算法
    // i用于遍历整个数组元素，指向当前这个元素，不为0的话继续往前移动
    // j 用于指向 下一个非0元素，将要存储的位置
    //如果 当前 i 不为0，则与j交换
}
