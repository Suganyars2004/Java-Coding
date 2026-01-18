public class fibonacci {
    public static void main(String[] args) {
        int n=4;
        int a=fib(n);
        System.out.println(a);
        }
        static int fib(int n){
            if(n<=0){
                return 0;
            }
            if(n==1){
                return 1;
            }
            return fib(n-1)+fib(n-2);
        }
}
