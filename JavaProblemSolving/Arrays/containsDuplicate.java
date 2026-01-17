package Arrays;

import java.util.Arrays;

public class containsDuplicate {
    public static void main(String[] args) {
        int a[]={2,1,4,5,2,1};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(a[i]==a[i+1]){
                System.out.println(a[i]);
                break;
            }
        }
    }
}
