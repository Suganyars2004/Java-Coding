package Arrays;

import java.util.Arrays;

public class containsDuplicate {
    public static void main(String[] args) {
        int a[]={1,2,3};
        boolean b=false;
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
               b=true;
            }
        }
        if(b==false){
            System.err.println("no duplicates");
        }
        else{
            System.err.println("contains duplicates");
        }
    }
}
