package Arrays;

public class TrappingWater {
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int leftMax=0,rightMax=0,total=0;
        int left=0;
        int right=arr.length-1;
        while (left<right) {
            if(arr[left]<=arr[right]){
                if(leftMax<arr[left]){
                    leftMax=arr[left];
                }
                else{
                    total+=leftMax-arr[left];
                }
                left++;
            }
            else{
                if(rightMax<arr[right]){
                    rightMax=arr[right];
                }
                else{
                    total+=rightMax-arr[right];
                }
                right--;
            }
        }
        System.out.println(total);
    }
}
