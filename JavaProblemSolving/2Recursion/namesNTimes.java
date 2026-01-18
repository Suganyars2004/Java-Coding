public class namesNTimes {
    public static void main(String[] args) {
        int n=5;
        names(0,n);
    }
    static void names(int a,int n){
        if(a==n){
            return;
        }
        System.out.println("suganya");
        names(a+1, n);
    }
}
