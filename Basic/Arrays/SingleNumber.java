package Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int nums[]={2,2,1,1,3};
        int res=0;
        for(int i:nums){
            res^=i;
        }
           System.out.println(res);

    }
}
