package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int nums[]={8,8};
        int largest=Integer.MIN_VALUE;
        int SecondLargest=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>largest){
                SecondLargest=largest;
                largest=i;
            }
            else if(i!=largest&&i>SecondLargest){
                SecondLargest=i;
            }
            else{
                continue;
            }
        }
        if(SecondLargest==Integer.MIN_VALUE){
            System.out.println("-1");
        }
        else{
        System.out.println(SecondLargest);
        }
    }
}
