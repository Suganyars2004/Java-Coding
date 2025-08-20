package Searching;

class searchin2D {
public static void main(String[] args) {
    int a[][]={{1,4,5},{9,44,7},{22,43,76}};
    int target=7;
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            if(a[i][j]==target){
                System.out.println("Target found at row "+i +" and column "+j);
            }
        }
    }
}    
}