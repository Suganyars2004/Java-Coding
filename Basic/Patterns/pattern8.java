package Patterns;

public class pattern8 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=5;j>n-i;j--){
                System.out.print(" ");
            }
            for(int z=0;z<n;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
