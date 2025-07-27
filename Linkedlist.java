package Dsa;

import java.util.Scanner;

class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data=data;
        this.next=null;
    }
}

class Linkedlisttraversal {
    ListNode head;
    void traversal(){
        if(head==null){
            System.out.println("List is empty");
        }
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;

        }
        System.out.println("Null");
    }
}
class adding extends Linkedlisttraversal{
    void insert_at_begin(int data){
        ListNode newnode=new ListNode(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    void insert_at_end(int data){
        ListNode newnode=new ListNode(data);
        if(head==null){
            head=newnode;
            return;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    void insert_at_pos(int data,int pos){
        ListNode newnode=new ListNode(data);
        ListNode temp=head;
        int cur_pos=1;
        if (pos==1){
            newnode.next=head;
            head=newnode;
        }
        while(temp!=null && cur_pos<pos-1){
            temp=temp.next;
            pos++;
        }
        if(temp==null){
            System.out.println("Invalid pos");
            return;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    void delete_node_at_begining(){
        ListNode temp;
        if(head==null){
            System.out.println("List is empty");
        }
        if(head.next==null){
            head=null;
            temp=null;
            return;
        }
        head=head.next;
        temp=null;
    }
    void delete_node_at_ending(){
        ListNode temp=head;
        ListNode prev=null;
        if(head==null){
            System.out.println("List is empty");
        }
        if(head.next==null){
            head=null;
            temp=null;
            return;
        }
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        temp=null;
    }
    void delete_node_at_pos(int pos){
        ListNode temp=head;
        int cur_pos=1;
        if(pos<0 || head==null){
            System.out.println("List is empty");
        }
        if(pos==1){
            head.next=null;
            temp=null;
        }
        ListNode prev=null;
        while(temp!=null && cur_pos<pos-1){
            prev=temp;
            temp=temp.next;
            cur_pos++;
        }
        if(temp==null){
            System.out.println("Out of range");
        }
        prev.next=temp.next;
    }
    void removedup(){
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            if (temp.data == temp.next.data){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
    }

}

public class Linkedlist{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Linkedlisttraversal ob=new Linkedlisttraversal();
        adding ob2=new adding();
        // ob2.insert_at_begin(55);
        // ob2.insert_at_begin(24);
        // ob2.insert_at_begin(242);
        
        // ob2.insert_at_end(30);
        // ob2.insert_at_pos(55, 2);
        // ob2.delete_node_at_begining();
        //  ob2.delete_node_at_ending();
        // ob2.delete_node_at_pos(2);
        // ob2.traversal();
        while (true) {
            System.out.println("\n==== Linked list Operations ====");
            System.out.println("1. Insert element at begining");
            System.out.println("2. Insert element at end");
            System.out.println("3. Insert element at certain position");
            System.out.println("4. Delete element at begining");
            System.out.println("5. Delete element at end");
            System.out.println("6. Delete element at certain position");
            System.out.println("7. Remove duplicates ");
            System.out.println("8. Display list");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                System.out.println("Enter element to add: ");
                ob2.insert_at_begin(sc.nextInt());
                break;
                case 2:
                System.out.println("Enter element to add: ");
                ob2.insert_at_end(sc.nextInt());
                break;
                case 3:
                System.out.println("Enter index and element to add: ");
                ob2.insert_at_pos(sc.nextInt(),sc.nextInt());
                break;
                case 4:
                ob2.delete_node_at_begining();
                break;
                case 5:
                ob2.delete_node_at_ending();
                break;
                case 6:
                System.out.println("Enter index to delete: ");
                ob2.insert_at_begin(sc.nextInt());
                break;
                case 7:
                
                ob2.removedup();
                break;
                case 8:
                ob2.traversal();
                
            }
        }
    }
}
