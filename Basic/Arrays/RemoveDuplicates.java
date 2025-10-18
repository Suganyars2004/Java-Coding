package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int a[]={1,2,3,3};
        int result=duplicates(a);
        System.out.println(result);
        }
        static int duplicates(int a[]){
            int left=0;
            for(int i=1;i<a.length;i++){
                if(a[left]==a[i]){
                   continue;
                }
                else{
                    left++;
                    a[left]=a[i];
                }
            }
            return left+1;
        }
    }

