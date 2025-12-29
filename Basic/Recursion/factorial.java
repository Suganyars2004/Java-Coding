package Recursion;

public class factorial {
    public static void main(String[] args) {
        int n=3;
        int a=fact(n);
        System.out.println(a);
    }
    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
