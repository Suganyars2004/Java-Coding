package Arrays;

import java.util.Arrays;

public class TwoArrayEqual {
    public static void main(String[] args) {
        int a[]={2,0,1,4,5,3};
        int b[]={0,1,2,3,4,5};
        boolean result=true;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(a[i]==b[i]){
                continue;
            }
            else{
               result=false;
               break;
            }
        }
        if(result==false){
            System.out.println("not equal");
        }
        else{
            System.out.println("Equal");
        }
    }
}
