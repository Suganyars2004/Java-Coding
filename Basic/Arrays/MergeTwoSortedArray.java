package Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int a[]={1,3,7,9};
        int b[]={1,2,5,6};
        int c[]=new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else{
                c[k]=b[j];
                j++;
                k++;
            }
        }
        while(i<a.length){
            c[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            c[k]=b[j]; 
            j++;
            k++;
        }
        for(int kl:c){
            System.out.println(kl);
        }
    }
}
