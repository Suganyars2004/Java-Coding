import java.util.Scanner;

public class prime {
     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean b=true;
        System.out.println("Enter Number");
        int a=in.nextInt();
        if(a<=1){
            b=false;
        }
        else{
            for(int i=2;i*i<=a;i++){
                if(a%i==0){
                    b=false;
                }
                else{
                    b=true;
                }
            }
        }
        if(b==true){
            System.out.println("prime Number");
        }
        else{
            System.out.println("Not a prime Number");
        }
        in.close();
    }
}
