package com.edu.leetcode;

import java.util.*;


/**
 * @author
 * @version 1.0
 * @team 魔法城堡
 * @date 2021/9/11 10:14
 */
public class QueneDemo {
    public static void testQuene(){
        Queue<String> qu = new LinkedList<>();
        qu.add("苹果");
        qu.add("华为");

        System.out.println("原始队列：");
        System.out.println(qu);

        System.out.println("通过add往队尾添加元素：");
        qu.add("OPPO");
        System.out.println(qu);
        System.out.println("通过offer往队列尾添加元素：");
        qu.offer("vivo");
        System.out.println(qu);

        System.out.println("使用remove删除队列头元素：");
        qu.remove();
        System.out.println(qu);
        System.out.println("使用poll删除对列头元素：");
        qu.poll();
        System.out.println(qu);
    }
    public static void main(String[] args){
        QueneDemo.testQuene();
    }

}
