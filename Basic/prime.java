import java.util.Scanner;

public class prime {
     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter Number");
        int a=in.nextInt();
        boolean result=false;
        if(a<=1){
            result=false;
        }
        else{
            for(int i=2;i*i<=a;i++){
                if(a%i==0){
                    result=true;
                    break;
                }
            }
        }
        if(result==true){
            System.out.println("Not a prime");
        }
        else{
            System.out.println("Prime number");
        }
        in.close();
    }
}
