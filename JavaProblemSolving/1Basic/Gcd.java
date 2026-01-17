public class Gcd {
     public static void main(String[] args) {
        int a=18;
        int b=48;
        int rs=gcd(a,b);  
        System.out.println(rs);  
    }
    
    static int gcd(int a,int b){
      while(b!=0){
       int temp=a%b;
       a=b;
       b=temp;
      }
      return a;
    }
}