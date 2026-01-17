package Patterns;

public class pattern1 {
    public static void main(String[] args) {
        char ch='A';
        int n=4;
        for(int i=0;i<n;i++){
            if(i==0||i==n-1){
                for(int j=0;j<n;j++){
                    System.out.print(ch);
                    ch++;
                }
            }
            else{
               for(int j=0;j<n;j++){
                   if(j==0||j==n-1){
                    System.out.print(ch);
                    ch++;
                   }
                   else{
                    System.out.print("$");
                   }
                } 
            }
            System.out.println();
        }
    }
}
