package Arrays;



public class RemoveDuplicates {
    public static void main(String[] args) {
        int a[]={1,2,3,3};
        int result=duplicates(a);
        System.out.println(result);
        }
        static int duplicates(int a[]){
            int j=0;
            for(int i=1;i<a.length;i++){
                if(a[i]==a[j]){
                    continue;
                }
                else{
                    j++;
                    a[j]=a[i];
                }
            }
            return j+1;
        }
    }

