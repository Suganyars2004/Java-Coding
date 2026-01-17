public class sumofdigits {
  public static void main(String[] args) {
        int num=1234;
        int sum=0;
        while(num!=0){
            int a=num%10;
            sum=sum+a;
            num=num/10;
        }
        System.out.println(sum);
  }   
}
