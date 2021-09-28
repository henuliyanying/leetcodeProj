package com.edu.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author
 * @version 1.0
 * @team 魔法城堡
 * @date 2021/9/10 13:10
 */
public class CQuene {
    //定义双端队列
    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public CQuene(){
        //LinkedList是Deque的实现类
        stack1 = new LinkedList<Integer>();
        stack2 = new LinkedList<Integer>();
    }

    //第一个栈负责插入元素
    public void appendTail(int value){
        stack1.push(value);
    }

    public int deleteHead(){
        //如果第二个栈为空
        if(stack2.isEmpty()){
            //如果第二个栈不为空
            while(!stack1.isEmpty()){
                //将第一个栈中的元素逐一出栈，依次push到第二个栈
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()){
            return -1;
        }else{
            //如果第二个栈不为空，说明已完成倒序元素，因此直接返回第二个栈的栈顶元素
            int deleteItem = stack2.pop();
            return deleteItem;
        }
    }

}
