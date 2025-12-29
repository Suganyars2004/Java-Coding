package LinkedList;


class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      this.next=null;
    }
}
public class middle {
    public static void main(String args[]){
     middle s=new middle();
     s.insert(5);  
     s.display(); }
     public void display(){
        Node head = null;
        Node ptr=head;
        while(ptr!=null){
            System.out.println(ptr.data);
            ptr=ptr.next;
        }
     }
    public void insert(int data){
    Node newNode=new Node(data);
     Node head = null;
     newNode.next=head;
     head=newNode;
    }
}
