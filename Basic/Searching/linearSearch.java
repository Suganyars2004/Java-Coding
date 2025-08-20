package Searching;

public class linearSearch {
    public static void main(String[] args) {
        int a[]={12,6,8,33,22};
        int target=3;
        boolean b=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==target){
                b=true;
                System.out.println("Target found at "+i);
                break;
            }
        }
        if(b==false){
            System.out.println("Not found");
        }
    }
}
