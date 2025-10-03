package Arrays;

public class ArraySubstOfAnother {
    public static void main(String[] args) {
        int a[]={1,2,2};
        int b[]={1,1};
        boolean res=false;;
        for(int i=0;i<b.length;i++){
            for(int j=0;j<a.length;j++){
              if(b[i]==a[j]){
                res=true;
                a[j]=0;
                break;
              }
              else{
                res=false;
              }
            }
            if(res==false){
                System.out.println(res);
                break;
            }
        }
        if(res==true){
            System.out.println(res);
        }
    }
}
