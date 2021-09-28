package com.edu.leetcode;

import java.util.Stack;

/**
 * @author
 * @version 1.0
 * @team 魔法城堡
 * @date 2021/9/21 10:51
 */
//反转链表
//迭代法
//利用栈进行反转，
public class reverseListSolution {
    //迭代方法 反转链表
    public static ListNode reverseListOne(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            //反转前先将下一个结点保存到临时变量里
            ListNode next = curr.next;
            //反转
            curr.next = prev;
            //当前结点变成前一个结点
            prev = curr;
            //下一个结点变成当前结点
            curr = next;
        }
        return prev;
    }
    //利用栈存储来反转链表
    public static ListNode reverseList(ListNode head){
        Stack<Integer> s = new Stack<>();
        ListNode n = head;
        //利用while循环插入向栈中数据
        while (n != null){
            s.push(n.val);
            n = n.next;
        }
        //将指针归位
        n = head;
        //利用while循环从栈里面向链表中赋值
        while (s.size()>0){
            n.val = s.pop();
            n = n.next;
        }
        return head;
    }
}
