package Recursion;

public class sumOfFirstNNumbers {
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        int a=sum(n,sum);
        System.out.println(a);
    }
    static int sum(int n,int sum){
        if(n<1){
            return sum;
        }
        sum+=n;
        return sum(n-1,sum);
    }
}
