package Arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List <Integer> list=new ArrayList<>();
        int top=0,bottom=a.length-1;
        int left=0,right=a[top].length;
        while(left<right){
            list.add(a[top][left]);
            left++;
            if(left==right-1){
                while(top<bottom){
                    list.add(a[top][left]);
                    top++;
                    if(top==bottom-1){
                        left--;
                        while (left<right) {
                           list.add(a[top][left]); 
                        }
                    }
                }
            }
           
        }
        System.out.println(list);
    }
}
