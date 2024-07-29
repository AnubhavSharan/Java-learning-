package Linked_list;

import java.net.StandardSocketOptions;

public class First_LL {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public class SLL {
        Node head;

        SLL() {
            this.head = null;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public void insertAtBegin(int data) {
            Node new_node = new Node(data);
            if (isEmpty()) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
        }

        public void insert_at_last(int data){
            Node new_node=new Node(data);
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new_node;
        }

        public void search(int data) {
            Node temp = head;
            boolean a = true;
            while (temp != null) {
                if (temp.data == data) {
                    System.out.print("number is present in the linked list");
                    a = false;
                }
                temp = temp.next;
            }
            if (a) {
                System.out.print("Number is not present in linked list");
            }
        }
        public void Find_and_insert(int number, int data){
            Node new_node = new Node(data);
            Node temp = head;
            boolean a = true;
            while(temp!=null){
                if(temp.data==number){
                    new_node.next=temp.next;
                    temp.next=new_node;
                    a=false;
                }
                temp=temp.next;

            }
            if(a){
                System.out.print("Number not present in the linked list");
            }

        }
        public void print(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;

            }
        }
    }

    public static void main(String[] args) {
        First_LL firstLL = new First_LL();
        SLL list = firstLL.new SLL(); // Need to instantiate the outer class first
//        System.out.println(list.isEmpty()); // Output: true
        list.insertAtBegin(10);
        list.insertAtBegin(3);

        list.insert_at_last(6);
        list.insert_at_last(8);
//        list.search(1);
//        System.out.println(list.isEmpty());
//        list.print();
        list.Find_and_insert(12, 9);
//        list.print();

    }
}
