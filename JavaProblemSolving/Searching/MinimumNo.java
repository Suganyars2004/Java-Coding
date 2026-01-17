package Searching;

public class MinimumNo {
    public static void main(String[] args) {
  
    int a[]={12,35,77,3,55};
    int minimum=a[0];
    for(int i=1;i<a.length;i++){
        if(a[i]<minimum){
            minimum=a[i];
        }
    }
    System.err.println("Minimum no is "+minimum);
}
}
