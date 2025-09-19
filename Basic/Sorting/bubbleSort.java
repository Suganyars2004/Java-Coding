package Sorting;

public class bubbleSort {
    public static void main(String[] args) {
      int a[]={23,87,1,54,33};
      int b[]=bubble(a);  
      for(int i=0;i<b.length;i++){
        System.out.println(b[i]);
      }
    }
    static int[] bubble(int arr[]){
        boolean sort=false;
        //for number of iterations
        for(int i=0;i<arr.length;i++){
            //j will be check and swap
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    sort=true;
                }
            }
            if(sort==false){
                break;
            }
        }
        return arr;
    }
}
