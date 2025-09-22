public class reverseno {
    public static void main(String[] args) {
        int n=-12345;
        int digit=0;
        int t=Math.abs(n);
        while(t>0){
            int a=t%10;
            digit=digit*10+a;
            t=t/10;
        }
        if(n<0){
            digit=-digit;
        }
        System.out.println(digit);
    } 
}
