package Arrays;

public class CountInversions {
    public static void main(String[] args) {
        int a[]={2,1};
        int result=count(a);
        System.out.println(result);
    }
    static int count(int a[]){
        int count=0;
        for(int i=0;i<a.length;i++){
            int right=i+1;
            while(right<a.length){
              if(a[i]>a[right]){
                count++;
              }
              right++;
            }
        }
        return count;
    }
}
