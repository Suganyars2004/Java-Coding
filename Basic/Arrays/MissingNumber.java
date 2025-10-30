package Arrays;


//ip=[0,2,3]
//op=1
public class MissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int len=arr.length+1;
        int ActualSum=(len*(len+1))/2;
        System.out.println(ActualSum-sum);
    }
}
