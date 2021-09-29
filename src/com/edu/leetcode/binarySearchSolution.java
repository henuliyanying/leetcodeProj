package com.edu.leetcode;

/**
 * @author
 * @version 1.0
 * @team 魔法城堡
 * @date 2021/9/29 9:13
 */
public class binarySearchSolution {
    /**
     * 二分查找——递归方式
     * 二分查找是针对已经排好序的数组
     * @param arr 待查找的有序数组
     * @param target 待查找关键字
     * @return 找到的位置
     * 时间复杂度：  最坏情况O（log2N）  最好情况O(1)
     * 空间复杂度： O(log2n)
     */
    public static int recursionBinarySearch(int[] arr,int target,int low,int high){

        if(target < arr[low] || target > arr[high] || low > high){
            return -1;
        }
        int mid = (low + high) /2;
        if(arr[mid] > target){
            //搜索区间在  左区域
            return recursionBinarySearch(arr,target,low,mid-1);
        }else if(arr[mid] < target){
            //搜索区间  在右区域
            return recursionBinarySearch(arr,target,mid +1,high);
        }else{
            return mid;
        }
    }

    //二分查找——非递归方式
    //时间复杂度：O(log2n)
    //空间复杂度：O(1)
    public static int commonBinarySearch(int[] arr,int target){
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        if(target < arr[low] || target > arr[high] || low > high){
            return -1;
        }

        while(low <= high){
            mid = (low + high) /2;
            if(arr[mid] > target){
                //搜索区间： 左区域
                high = mid -1;
            }else if(arr[mid] < target){
                //搜索区间： 右区域
                low = mid +1;
            }else{
                return mid;
            }
        }
        return -1;//找到最后仍然没找到，则返回-1；
    }
}
