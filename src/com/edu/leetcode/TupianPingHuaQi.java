package com.edu.leetcode;

import java.util.Arrays;

/**
 * @author
 * @version 1.0
 * @team 魔法城堡
 * @date 2021/9/9 10:25
 */
public class TupianPingHuaQi {
    public int[][] imageSmoother(int[][] M) {
        int Row = M.length, Cow = M[0].length;
        System.out.println("R:"+Row);//R是控制行的；
        System.out.println("C:"+Cow);//C是控制列的

        int[][] ans = new int[Row][Cow];
        //for循环 如果循环体内只有一条执行语句，则不用加大括号
        //如果执行语句为多条语句，则必须用大括号括起来
        for (int r = 0; r < Row; ++r) {
            for (int c = 0; c < Cow; ++c) {
                int count = 0;
                for (int nr = r - 1; nr <= r + 1; ++nr) {
                    for (int nc = c - 1; nc <= c + 1; ++nc) {
                        if (0 <= nr && nr < Row && 0 <= nc && nc < Cow) {
                            System.out.println(M[nr][nc]);
                            ans[r][c] += M[nr][nc];
                            count++;
                        }
                    }
                }
                ans[r][c] /= count;
            }
        }
        return ans;
    }

    public static void main(String[] args){

        //学习：定义一个二维数组
        int[][] arr = new int[][]{{1,1,1},{1,0,1},{1,1,1},{1,2,1}};

        int[][] res = new TupianPingHuaQi().imageSmoother(arr);
        //学习：打印一个数组时要先进行toString()
        System.out.println(Arrays.deepToString(res));
    }
}
