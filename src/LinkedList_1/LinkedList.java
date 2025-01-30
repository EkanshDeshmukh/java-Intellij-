package LinkedList_1;

import org.w3c.dom.Node;

public class LinkedList{
    class Node{
        int data;

        Node next;
        Node(int data){
            this.data = data;
        }
    }
    Node head;

    public void display(){
        System.out.println("--------------");
        Node temp = this.head;

        while (temp != null){

            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
    public void addFirst(int data){
        Node nn = new Node(data);
        nn.next = this.head;
        this.head = nn;

    }
    public void addLast(int data){
        Node nn = new Node(data);
        Node temp = this.head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = nn;
    }
    public void addAt(int data,int idx){
        if(idx < 0) return;
        if(idx == 0){
            addFirst(data);
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
    }

    public int removeFirst(){
        if(this.head == null) return -1;
        int rv = this.head.data;
        this.head = this.head.next;
        return rv;
    }
    public int removeLast(){
        Node temp = this.head;
        while (temp.next.next != null){
            temp=temp.next;
        }
        int rv = this.head.data;
        temp.next=null;
        return rv;
    }
    public int removeAt(int idx){
        if(idx < 0)return -1;
        if(idx == 0){
            return removeFirst();
        }
        Node temp = this.head;
        for(int i = 0; i<idx-1; i++){
            temp =  temp.next;
        }
        int rv = temp.next.data;
        temp.next = temp.next.next;
        return rv;
    }

}


//LinkedList is a data structure used for storing collection of data.
//pros -> simple & easy to use -> Faster access to random elem
//cons -> preallocation of memory -> static -> insertion operation complication