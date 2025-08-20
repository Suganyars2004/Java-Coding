public class armstrong {
     public static void main(String[] args) {
        int a=9474;
        int b=a;
        String s=Integer.toString(a);
        int len=s.length();
        int result=0;
        while(a!=0){
           int x=a%10;
           result=result+(int)Math.pow(x,len);
           a=a/10;
        }
        if(b==result){
        System.out.println("armstrong number");
        }
        else{
            System.out.println("not a armstrong number");
        }
    }
}
