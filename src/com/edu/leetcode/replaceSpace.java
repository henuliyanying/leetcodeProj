package com.edu.leetcode;

/**
 * @author
 * @version 1.0
 * @team 魔法城堡
 * @date 2021/9/21 9:28
 */
public class replaceSpace {
//    public static String replaceStr(String s){
//        s = s.replaceAll(" ","%20");
//        System.out.println(s);
//        return s;
//    }

    public static String replaceStr(String s){
        //在python、java 等语言中，字符串都被设计 成 不可变的类型，即无法直接修改字符串的某一位字符，需要新建一个字符串实现
        //StringBuffer是可变字符串的类型
        StringBuffer res = new StringBuffer();
        for(Character c : s.toCharArray()){
            if(c == ' '){
                res.append("%20");
            }else{
                res.append(c);
            }
        }
        System.out.println(res.toString());
        return res.toString();
    }

    public static void main(String args[]){
        String res = replaceSpace.replaceStr("We are happy.");
    }
}
