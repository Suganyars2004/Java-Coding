package Arrays;

public class Sort {
    public static void main(String[] args) {
        int a[]={0,1,2,0,1,2};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                int k=j+1;
                if(a[j]>a[k]){
                    int temp=a[j];
                    a[j]=a[k];
                    a[k]=temp;
                }
            }
        }
        for(int i:a){
            System.out.println(a[i]);
        }

    }
}
