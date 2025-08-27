package Arrays;

import java.util.Arrays;

public class productOfArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            int pro=1;
            for(int j=0;j<a.length;j++){
                if(j==i){
                    continue;
                }
                else{
                    pro=pro*a[j];
                }
            }
            b[i]=pro;
        }
        System.out.println(Arrays.toString(b));
    }
}
