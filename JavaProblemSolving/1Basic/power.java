public class power {
    public static void main(String[] args) {
        int a=10;
        int res=0;
        int b=Math.abs(a);
        while(b>0){
            int n=b%10;
            res=res*10+n;
            b=b/10;
        }
        int pow=1;
        for(int i=0;i<res;i++){
            pow*=a;
        }
        System.out.println(pow);
    }
}
