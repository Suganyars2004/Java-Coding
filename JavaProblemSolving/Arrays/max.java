package Arrays;

public class max {
    public static void main(String[] args) {
        int a[]={12,34,88,77,56};
        int m=max(a);
        System.out.println(m);
    }
    static int max(int a[]){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }

        }
        return max;    }
}
