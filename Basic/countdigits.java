public class countdigits {
     public static void main(String[] args) {
        int a=-1234;
        int count=0;
        a=Math.abs(a);
        if(a==0){
            count=1;
        }
        else{
        while(a>0){
            count++;
            a=a/10;
        }
    }
        System.out.println(count);
    }
}
