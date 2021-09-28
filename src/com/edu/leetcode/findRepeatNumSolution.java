package com.edu.leetcode;

/**
 * @author
 * @version 1.0
 * @team 魔法城堡
 * @date 2021/9/27 9:02
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 找出数组中任意一个重复的数字，不用返回所有
 */
public class findRepeatNumSolution {
    /**
     * 超时
     * arraylist遍历查找，时间复杂度为O(n)
     * 用arraylist程序会变成双循环 时间复杂度为O(n2)
     * @param nums
     * @return
     */
    public static int findRepeatNumber(int[] nums){
        List<Integer> list = new ArrayList<Integer>();
        for(int i: nums){
            if(list.contains(i)){
                return i;
            }else{
                list.add(i);
            }
        }
        return -1;
    }

    /**
     * 不超时
     * hashSet中的contain()方法是用hashcode进行查找，时间复杂度为O（1）
     * 利用Set集合,不重复元素
     * 空间复杂度为：O(N)
     * @param nums
     * @return
     */
    public static int findRepeatNumber2(int[] nums){
        Set<Integer> testSet = new HashSet<Integer>();
        for (int i:nums){
            if(testSet.contains(nums[i])){
                return nums[i];
            }
            testSet.add(nums[i]);
        }
        return -1;
    }

    /**
     * 最优解法
     * 原地排序
     * @param nums
     * @return
     */
    public static int findRepeatNumber3(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            //只要下标不等于下标对应的值 都需要交换
            //if(nums[i] != i){ 因为不是交换一个元素，而是一直交换，所以需要用while
            while(nums[i] != i){
                //如果当前下标的值 和 以这个值为下标的值相等  则一定重复，直接返回
                //!!!注意：这个必须在交换值的上面。原因：如果相等，则没有必要执行下面的交换，所以，先判断是否相等
                if(nums[nums[i]] == nums[i]){
                    return nums[i];
                }
                //交换
                int tmp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = tmp;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] a = new int[]{1,2,3,4,5,5};
        int res = findRepeatNumSolution.findRepeatNumber3(a);
        System.out.println(res);
    }
}
