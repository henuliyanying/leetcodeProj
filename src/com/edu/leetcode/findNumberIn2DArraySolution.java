package com.edu.leetcode;

/**
 *
 * 在一个特殊的二维数组中，寻找数组中是否含有该整数
 * 题目关键词：二分查找  分治  矩阵
 * @author lyy
 * @version 1.0
 * @team 魔法城堡
 * @date 2021/9/29 8:46
 */
public class findNumberIn2DArraySolution {
    //暴力解法
    //时间复杂度：O(mn)
    //空间复杂度:O(1)
    public static boolean findNumberIn2DArray1(int[][] matrix,int target){

        if(matrix == null || matrix.length ==0 || (matrix.length == 1 && matrix[0].length == 0)){
            return false;
        }

        int row = matrix.length; //行数
        int clomn = matrix[0].length; //某一行的长度就是列数

        //循环查找二维数组中的元素
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < clomn; j++) {
                if(matrix[i][j] == target){
                    return true;
                }else{
                    continue;
                }
            }
        }
        return false;
    }

    //方法2：线性查找。
    //重点：从二维数组的右上角开始查找
    // 大概思路：如果当前元素和目标值相等，返回true。大于目标值，由此往左边一列。如果当前元素小于目标值，移到下一行
    //如果 num 大于 target，列下标减 1
    //如果 num 小于 target，行下标加 1
    //时间复杂度：O(m+n)
    //空间复杂度: O(1)
    public static boolean findNumberIn2DArray2(int[][] matrix,int target){
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int rows = matrix.length,clomns = matrix[0].length;
        int row = 0,clomn = clomns -1;
        //注意循环条件
        while(row < rows && clomn >= 0){
            int num = matrix[row][clomn];
            if(num == target){
                return true;
            }else if(num > target){
                clomn--;
            }else{
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[][] numeight={{100,200,300,400},{500,600,700,800},{900,1000,1100,1200,1300}};
        boolean res = findNumberIn2DArraySolution.findNumberIn2DArray1(numeight,300);
        System.out.println(res);
    }
}
