package LinkedList;

public class LinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node InsertAtHead(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
    static Node InsertAtTail(Node head,int data){
        Node temp = head;
        Node newNode = new Node(data);
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    static Node InsertAtnth(Node head,int data,int key){
        Node temp = head;
        Node prev = null;
        int c = 1;
        while(temp != null){
            Node newNode = new Node(data);
            if(c == key){
              newNode.next = temp;
              prev.next = newNode;
            }
            prev = temp;
            temp = temp.next;
            c++;
        }
        return head;
    }
    static Node InsertBydataue(Node head,int element,int data){
        Node temp = head;
        Node prev = null;
        while(temp.next != null){
            Node newNode = new Node(data);
            if(temp.data == element){
                newNode.next = temp;
                prev.next =  newNode;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    static Node deleteHead(Node head){
        Node temp = head;
        head = temp.next;

        return head;
    }
    static Node deleteNthNode(Node head,int n){
        Node temp = head;
        Node prev = null;
        int c = 1;

        while(temp!=null){
            if(c==n){
                prev.next = temp.next;
                temp.next = null;
            }
            prev = temp;
            temp= temp.next;
            c++;
        }
        return head;
    }
    static Node deleteBydataue(Node head,int data){
        Node temp = head;
        Node prev = null;

        while(temp!=null){
            if(temp.data == data){
                prev.next = temp.next;
                temp.next = null;
            }
            prev = temp;
            temp= temp.next;
        }
        return head;

    }
}