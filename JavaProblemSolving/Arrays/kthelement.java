package Arrays;

import java.util.Arrays;

public class kthelement {
    public static void main(String[] args) {
        int a[]={2,3,6,7,9};
        int b[]={1,4,8,10};
        int k=5;
        int c[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i]; //c[0]=2,3,6,7,9
        }
         int z=0;
        for(int i=a.length;i<a.length+b.length;i++){
            c[i]=b[z];//c[5]=1
            z++;
        }
        Arrays.sort(c);
        System.out.println(c[k-1]);
    }
}
