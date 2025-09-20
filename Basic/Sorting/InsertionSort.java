package Sorting;
public class InsertionSort {
    public static void main(String[] args) {
      int a[]={5,3,4,1,2};
      insertion(a);  
      for(int i:a){
        System.out.println(i);
      }
    }
    static int[] insertion(int a[]){
        for(int i=0;i<=a.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
        return a;
    }
}
