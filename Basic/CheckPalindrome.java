public class CheckPalindrome {
    public static void main(String[] args) {
        int a=121;
        int b=a;
        int rev=0;
        while(a!=0){
          int n=a%10;
          rev=rev*10+n;
          a=a/10;
        }
        if(b<0){
            System.out.println("not a palindrome");
        }
        else if(b==rev){
            System.out.println("palindrome");
        }
        else
           System.out.println("not a palindrome");
    }
}
