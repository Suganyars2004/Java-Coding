package Patterns;

public class pattern7 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int z=0;z<i;z++){
                    System.out.print(" ");
                }
            for(int j=0;j<n*2-1-i*2;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
