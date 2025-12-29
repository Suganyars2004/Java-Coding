package Arrays;
public class largestElement{
    public static void main(String[] args) {
        int nums[]={3,3,0,99,-40};
        int largest=Integer.MIN_VALUE;
        for(int i:nums){
         if(i>largest){
            largest=i;
         }
        }
        System.out.println(largest);
    }
}