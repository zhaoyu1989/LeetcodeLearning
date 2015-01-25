package com.yu.zhao.test;

import java.util.Scanner; 

public class Josephus { 
    private static class Node { 
        public int no;// 编号 
        public Node next;// 下一个节点 
 
        public Node(int no) { 
            this.no = no; 
        } 
    } 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("请输入总人数："); 
        int totalNum = scanner.nextInt(); 
        System.out.print("请输入报数的大小："); 
        int cycleNum = scanner.nextInt(); 
        Node header = new Node(1); 
        Node pointer = header; 
        for (int i = 2; i <= totalNum; i++) { 
            pointer.next = new Node(i); 
            pointer = pointer.next; 
        } 
        pointer.next = header; 
        // 初始化环形链表结束 
        System.out.println("以下是出列的顺序:"); 
        while (pointer != pointer.next) { 
            for (int i = 1; i < cycleNum; i++) { 
                pointer = pointer.next; 
            } 
            System.out.println(pointer.next.no); 
            pointer.next = pointer.next.next; 
        } 
        System.out.println(pointer.next.no); 
    } 
} 