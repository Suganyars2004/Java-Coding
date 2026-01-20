package Arrays.medium;

import java.util.ArrayList;

public class ArrayLeaders {
   public static void main(String[] args) {
    int arr[]={16,17,4,3,5,2};
    boolean leader=true;
    ArrayList<Integer> a=new ArrayList<>();
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                continue;
            }
            else{
                leader=false;
                break;
            }
        }
        if(leader==true){
            a.add(arr[i]);
        }
        leader=true;
    }
    System.out.println(a);
   } 
}
