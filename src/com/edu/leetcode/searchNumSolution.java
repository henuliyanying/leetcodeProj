package com.edu.leetcode;

/**
 * @author
 * @version 1.0
 * @team 魔法城堡
 * @date 2021/9/27 11:31
 */
//统计一个指定数字 在排序数组中出现的次数
//方法一：暴力解法：遍历输入数组一次，使用一个计数器变量count统计目标元素target出现的次数
//以下为方法二：
public class searchNumSolution {
    /** 方法二：二分查找
     * 重点：先找到目标元素target第一次出现的位置（下标）：firstPosition
     * 再找到目标元素target最后一次出现的位置（下标）：lastPosition
     * 二者之差再加1 ，就是目标元素target出现的次数
     * 二分查找的时间复杂度为：O(logn)
     * 时间复杂度：O(logn) ，这里的n为数组的长度
     * 空间复杂度：O(1) 只用到常数个临时变量
     * @param nums
     * @param target
     * @return
     */
    public static int searchBinary(int[] nums,int target){
        int len = nums.length;
        if(len == 0){
            return 0;
        }
        int firstPosition = findFirstPosition(nums,target);
        if(firstPosition == -1){
            return 0;
        }

        int lastPosition = findLastPosition(nums,target);//执行到这一行，说明数组中一定含有目标元素
        return lastPosition - firstPosition +1;
    }


    //查找目标元素第一次出现的位置
    private static int findFirstPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while(left < right){
            //这样写的目的是：为了防止当left 和 right很大时，整型数据溢出
            int mid = left + (right - left)/2;
            if(nums[mid] < target){
                //搜索区间：[mid + 1 ...right]
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        //完成以上代码：代表left和right重合。
        //也有可能nums[left]==target
        if(nums[left] == target){
            return left;
        }
        //也有可能找到target
        return -1;
    }


    //查找目标元素最后一次出现的位置
    private static int findLastPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        while(left < right){
            //这样写的目的是：为了防止当left 和 right很大时，整型数据溢出
            //此刻 +1是代表向上取整，经验之谈
            int mid = left + (right - left + 1)/2;
            //原：int mid = left + (right - left)/2;
            if(nums[mid] <= target){
                //搜索区间：[mid + 1 ...right]
                left = mid;
            }else{
                //nums[mid] > target
                //搜索区间：[left ...mid]
                right = mid - 1;
            }
        }
        /**  这一段可以省略掉。
         * 原因：因为执行完
        //完成以上代码：代表left和right重合。
        //也有可能nums[left]==target
        if(nums[left] == target){
            return left;
        }
        //也有可能找到target
        return -1;
        **/
        return left;
    }


    public static void main(String[] args){
        int[] nums = new int[]{5,7,7,7,8,8,10};
        int res = searchNumSolution.searchBinary(nums,8);
        System.out.println("结果呢？"+res);
    }
}
