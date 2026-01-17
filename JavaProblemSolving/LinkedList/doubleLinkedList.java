package LinkedList;
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class doubleLinkedList {
    Node head=null;
    public static void main(String[] args) {
        
    }
    void insertBeginning(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
    void insertLast(int data){
        Node newnode=new Node(data);
        if(head==null){
            insertBeginning(data);
        }
        Node temp=head;
        while (temp!=null) {
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
        
    }
    void insertIndex(int index,int data){
        Node newnNode=new Node(data);
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        newnNode.next=temp.next;
        temp.next=newnNode;
        newnNode.prev=temp;
        temp.next.prev=newnNode;
    }
    void delete(int data){
        Node ptr=head;
        if(ptr.data==data){

        }    }
}
