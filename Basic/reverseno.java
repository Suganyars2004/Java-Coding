public class reverseno {
    public static void main(String[] args) {
        int n=12345;
        int res=0;
        while(n!=0){
            int num=n%10;
            if(res>Integer.MAX_VALUE/10 || res<Integer.MIN_VALUE/10){
                System.out.println("0");
                break;
            }
            res=res*10+num;
            n=n/10;
        }
        System.out.println(res);
    } 
}
