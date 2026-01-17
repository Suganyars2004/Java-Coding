package Searching;

public class evenNoOfDigits {
    public static void main(String[] args) {
        int a[]={11,2,345,7777,};
        int even=0;
        for(int i=0;i<a.length;i++){
            int count=0;
            int num=a[i];
            String s=Integer.toString(num);
            for(int j=0;j<s.length();j++){
               while(num!=0){
                    count++;
                    num=num/10;
                }
                
            }
            if(count%2==0){
                   even++;
            }
        }
        System.out.println(even);
    }
}
