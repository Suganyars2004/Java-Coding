package Patterns;
import java.util.Scanner;
public class square {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n");
        int a=in.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
             System.out.print("* ");
            }
            System.out.println();
        }
        in.close();
    }
}
