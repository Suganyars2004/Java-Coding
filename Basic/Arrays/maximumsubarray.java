package Arrays;

public class maximumsubarray {
    public static void main(String[] args) {
        int a[]={-2,1,-3,4,-1,-2,1,5,-3};
        int max=maximumsubarray(a);
        if(max<0){
            System.out.println("0");
        }
        else{
        System.out.println(max);
        }
    }
    static int maximumsubarray(int a[]){
        int sum=0;
        int maximumSum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
           sum+=a[i];
           if(sum>maximumSum){
            maximumSum=sum;
           }
           if(sum<0){
            sum=0;
           }
        }
       return maximumSum; 
    }
}
