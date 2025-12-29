package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      this.next=null;
    }
}
public class practice {
     Node head=null;
    public static void main(String[] args) {
        practice list=new practice();
        list.insertBeginning(1);
        list.insertBeginning(2);
        list.insertLast(3);
        list.insertMiddle(4,1 );
        list.display();
        list.deleteIndex(0);
        list.display();

    }
    void insertMiddle(int data,int index){
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=0;i<index-1;i++){
          temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    void insertLast(int data){
        if(head==null){
            insertBeginning(data);
        }
        else{
            Node newNode=new Node(data);
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }

    }
    void insertBeginning(int data){
       
       Node newNode=new Node(data);
       newNode.next=head;
       head=newNode;
    }
    void display(){
       
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    void deleteValue(int data){
        Node temp=head;
        if(head.data==data){
            head=head.next;
        }
        while(temp.next!=null && temp.next.data!=data){
           temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("invalid");
        }
        else{
            temp.next=temp.next.next;
        }
    }
    void deleteIndex(int index){
        Node temp=head;
        if(index==0){
            head=head.next;
        }
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;    }
}
