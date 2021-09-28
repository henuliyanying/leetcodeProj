package com.edu.leetcode;

import java.util.LinkedList;

/**
 * @author
 * @version 1.0
 * @team 魔法城堡
 * @date 2021/9/23 20:17
 */
public class CQueneOne {

    //定义一个栈
    //为什么LinkedList可以用作栈和队列
    // LinkedList是一个继承AbstractSequentialList的双向链表，实现了Deque(双端队列)接口，也就实现了Deque接口中的方法，所以它可以被当作堆栈、队列或双端队列进行操作。
    LinkedList<Integer> A,B;

    public CQueneOne(){
        //初始化一个栈
        A = new LinkedList<Integer>();
        B = new LinkedList<Integer>();
    }
    public void appendTail(int value){
        //将元素链接到链表尾部
        A.addLast(value);
    }
    public int deleteHead(){
        if(!B.isEmpty()){
            //删除最后一个元素，删除元素后，此方法返回元素
            return B.removeLast();
        }
        if(A.isEmpty()){
            return -1;
        }
        while (!A.isEmpty()){
            B.addLast(A.removeLast());
        }
        return B.removeLast();
    }
}
