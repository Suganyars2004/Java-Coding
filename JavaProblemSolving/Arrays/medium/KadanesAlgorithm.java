package Arrays.medium;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int a[]={-2,-4};
        int result=kad(a);
        System.out.println(result);
    }
    static int kad(int a[]){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
}
