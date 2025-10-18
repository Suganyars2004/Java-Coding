package LinkedList;
class A{
    int l=7;
    int b=4;
}
class B extends A{
    int w=6;
}
public class p {
    public static void main(String[] args) {
        A obj=new B();
        System.out.println(obj.l);
    }
}
