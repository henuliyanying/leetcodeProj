package com.edu.leetcode;

/**
 * @author
 * @version 1.0
 * @team 魔法城堡
 * @date 2021/9/26 17:06
 */
public class reverseLeftWordSolution {
    public static String reverseSoluTwo(String s,int n){
        StringBuffer res = new StringBuffer();
        for (int i = n; i < s.length(); i++) {
            res.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            res.append(s.charAt(i));
        }
        return res.toString();
    }




    //对于字符串，将前n个字符  挪动到字符串最后
    public static String reverseLeftWords(String s,int n){
        //截取前n个字符串
        String pre = s.substring(0,n);
        String after = s.substring(n);
        return after+pre;
    }
    public static void main(String[] args){
        String d = reverseLeftWordSolution.reverseSoluTwo("abcdegf",2);
        System.out.println(d);
    }
}
