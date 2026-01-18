

public class from1ToN {
    public static void main(String[] args) {
       int n=5;
       print(1, n); 
    }
    static void print(int a,int n){
       if(a>n){
        return;
       }
       System.out.println(a);
       print(a+1, n);
    }
}
