import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.println("Enter number");
       int a=in.nextInt();
       if((a%4==0&&a%100!=0)||(a%400==0)) {
        System.out.println("its leap year");
       }
       else{
        System.out.println("Not a leap yaer");
       }
    }
}
