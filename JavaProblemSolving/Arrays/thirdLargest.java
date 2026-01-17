package Arrays;

public class thirdLargest {
    public static void main(String[] args) {
        int arr[]={3,4};
        int a=largest(arr);
        System.out.println(a);
    }
    static int largest(int arr[]){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        if(arr.length<3){//what if there is only 2 elements it must display the greatest among all
            third=arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i]>third){
                    third=arr[i];
                }
            }
            return third;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
                continue;
            }
            if(arr[i]>second){
                third=second;
                second=arr[i];
                continue;
            }
            if(arr[i]>third){
                third=arr[i];
            }
        }
      return third;
    }
    }

