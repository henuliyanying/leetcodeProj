package com.edu.leetcode;

import java.util.HashMap;

/**
 * @author
 * @version 1.0
 * @team 魔法城堡
 * @date 2021/9/26 16:31
 */

public class copyRandomListSolution {
    //原来的链表结点：师父
    //复制的链表结点：徒弟
    public static Node copyRandomList(Node head){
        Node curr = head;
        HashMap<Node,Node>  map = new HashMap<>();

        //Step1:将师徒关系存入map中
        while(curr != null){
            //将师徒关系存入map中，key:师父  value:徒弟。要和师父的值相等
            map.put(curr,new Node(curr.val));
            curr = curr.next;
        }
        //Step2:将next和random传递给徒弟
        curr = head;
        while(curr != null){
            //map.get(curr);  //获取当前结点的徒弟结点
            map.get(curr.next); //获取当前结点的下一个结点的徒弟结点
            //当前徒弟的指向由它师父的指向来获得
            //徒弟结点的指针指向 现在师父结点的下一个指向的徒弟结点
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }
        //返回徒弟链表的头结点
        return map.get(head);
    }
}

//总结：
//1：通过一次遍历将value值存起来
//2: 第二次遍历，建立map。处理徒弟的指向关系
//3: 返回徒弟链表的第一个结点。

