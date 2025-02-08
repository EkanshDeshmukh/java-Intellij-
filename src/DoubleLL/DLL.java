package DoubleLL;

import LinkedList_1.LinkedList;

public class DLL {
    Node head;
    class Node{

        int data;
        Node prev;
        Node next;
        Node(int d){
        data = d;
        prev = null;
        next= null;
        }
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }
    public void insertFront(int data){
        Node newNode = new Node(data);
        newNode.prev = null;
        newNode.next = head;

        if(head != null){
        head.prev = newNode;
        }
        head = newNode;
    }
    public void insertAtEnd(int data){
        if(head == null){
            insertFront(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    public void insertAtIDX(int data,int idx){
        if(idx < 0) return;
        if(idx == 0){
            insertFront(data);
            return;
        }
         Node nn = new Node(data);
         Node temp = this.head;

        for(int i = 0; i<idx-1; i++){
            temp = temp.next;
        }
         Node forward = temp.next;

        temp.next = nn;
        nn.next = forward;
        nn.prev = temp;
        forward.prev = nn;
    }

    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.insertFront(10);
        dll.insertFront(20);
        dll.insertFront(30);
        dll.insertAtEnd(40);
        dll.insertAtIDX(50,2);
        dll.display();
    }
}
