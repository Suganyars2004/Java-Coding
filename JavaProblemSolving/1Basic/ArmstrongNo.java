public class ArmstrongNo {
     public static void main(String[] args) {
        int a=12;
        int count=0;
        int result=0;
        int temp=a,temp1=a;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        while(temp1>0){
            int t=temp1%10;
            int par=1;
            for(int j=0;j<count;j++){
                par*=t;
            }
            result+=par;
            temp1=temp1/10;
        }
     if(a==result){
        System.out.println("armstrong");;
     }
     else{
        System.out.println("no");
     }
    }
}
