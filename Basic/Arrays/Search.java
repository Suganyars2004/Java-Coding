package Arrays;

public class Search {
    public static void main(String[] args) {
        int arr[]={10,8,30};
        int x=5;
        int result=linear(arr,x);
        System.out.println(result);
    }
    static int linear(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    
}
