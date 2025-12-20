package Patterns;

public class onetonwithoutloop {
    public static void main(String[] args) {
        int n=10;
        int a=1;
        sum(a,n);
    }
    public static void sum(int a,int n){
        if(a<=n){
            System.out.print(a+" ");
            a=a+1;
            sum(a,n);
        }
        return;
    }
}
