package Arrays;

import java.util.Arrays;


public class MajorityElement {
    public static void main(String[] args) {
        int a[]={6,6,6,7,7};
        Arrays.sort(a);
        int count=1,maxCount=0,output=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i-1]==a[i]){
                count++;
                if(count>maxCount){
                    maxCount=count;
                    output=a[i];
                }
            }
            else{
                count=1;
            }
        }
        System.out.println(output);
    }   
}
