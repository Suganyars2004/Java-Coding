package Arrays.medium;

public class Sort {
    public static void main(String[] args) {
        int a[]={0,1,2,0,1,2};
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length-i;j++){
                if(a[j-1]>a[j]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
        for(int i:a){
            System.out.println(i);
        }
    }
}
