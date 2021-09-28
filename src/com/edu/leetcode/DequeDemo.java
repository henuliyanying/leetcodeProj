package com.edu.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author
 * @version 1.0
 * @team 魔法城堡
 * @date 2021/9/11 10:59
 */
public class DequeDemo {
    public static void dequeTest(){
        Deque<String> deque = new LinkedList<String >();
        deque.push("苹果");
        deque.push("华为");
        System.out.println("通过push(e)往队尾添加元素：");
        System.out.println(deque);

        //获取栈首元素后，元素不会出栈
        //peek()获取队首元素，不删除
        String str = deque.peek();
        System.out.println("获取队首元素peek()的返回值："+str);
        System.out.println("通过peek()之后的：(只是获取，栈中还有这个元素)："+deque);

        //pop获取队首元素并删除
        String pos = deque.pop();
        System.out.println(pos);
        System.out.println("通过pop()之后的：（会把pop()的结果删掉）："+deque);

        //element获取队首元素，不删除
        String ele = deque.element();
        System.out.println("通过element()的返回值："+ele);
        System.out.println("通过ele之后的栈："+deque);

        //peek()获取队首元素，不删除
        String peekRes = deque.peek();
        System.out.println("通过pekk()的返回值:"+peekRes);
        System.out.println("通过peek()之后的栈："+deque);
    }
    public static void main(String args[]){
        DequeDemo.dequeTest();
    }

}
