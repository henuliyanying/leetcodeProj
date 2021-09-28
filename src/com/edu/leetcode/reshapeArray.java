package com.edu.leetcode;

import java.util.*;

/**
 * @author
 * @version 1.0
 * @team 魔法城堡
 * @date 2021/9/19 11:55
 */
public class reshapeArray {
    public static int[][] reshapeArray(int[][] mat,int r,int c){
        //输入是一个 原数组、矩阵新的行、列
        //先判断给定的行、列构成的矩阵是否满足原始矩阵————即是否合理
        //如何判断：遍历数组得到数组的行、列  r*c 是否等于 行列长度的乘积
        //获取行数
//        int rows = mat.length;
        //获取列数
//        int columns = mat[0].length;
        //声明一个list集合
        Queue queue = new LinkedList();

        //判断给定操作是否合理
        if((mat.length) * (mat[0].length) == r * c){
            //定义一个指定大小的二维数组
            int newArray[][] = new int[r][c];
            //如果相等，则合理
            // 想办法：按行遍历顺序填充
            for(int i = 0;i < mat.length;i++){
                for(int j = 0;j < mat[0].length;j++){
                    queue.add(mat[i][j]);
                }
            }
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    newArray[j][k] = (int) queue.remove();
                }
            }
            return newArray;
        }else{
            //如果给定操作不合理，直接返回原数组
            return mat;
        }
    }

    //重塑数组。先将二维数组转化为一维数组，再转为一维数组
    public static int[][] testReshapeArray(int[][] mat,int r,int c){
        int m = mat.length;
        int n = mat[0].length;

        //定义一个新的二维数组
        int newArray[][] = new int[r][c];
        if(m*n == r*c){
            //利用二维数组转一维数组再转二维数组
            for (int i = 0; i < m*n; i++) {
                newArray[i/c][i%c] = mat[i/n][i%n];
            }
            return newArray;
        }else{
            return mat;
        }

    }


    public static void main(String args[]){
        //声明二维数组
        int myArray[][] = { {1,2}, {4,5}};
        int res[][] = reshapeArray.testReshapeArray(myArray,1,4);
        System.out.println("res:"+res);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.println(res[i][j]);
            }
        }
    }
}
