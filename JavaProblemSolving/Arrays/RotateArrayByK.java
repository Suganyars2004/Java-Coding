package Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int k=1;
        int n=a.length;
        k=k%n;
        reverse(a,0,n-1);
        reverse(a,0,k-1);
        reverse(a, k, n-1);
    for(int i:a){
        System.out.println(i);
    }    }
    static int[] reverse(int arr[],int start,int end){
        while (start<end) 
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
}