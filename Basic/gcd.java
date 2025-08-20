public class gcd {
     public static void main(String[] args) {
        int a=48;
        int b=18;
        int rs=gcd(a,b);  
        System.out.println(rs);  
    }
    
    static int gcd(int a,int b){
       while(b!=0){
        int c=b;
        b=a%b;
        a=c;
       }
    return a;
    }
}