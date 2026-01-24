package Arrays.medium;

//moores voting algorithm
public class MajorityElement {
    public static void main(String[] args) {
        int a[]={6,6,6,7,7};
        int i=0;
        int count=0;
        int element=0;
        while(i<a.length){
            if(count==0){
            count++;
            element=a[i];
            }
            else if(a[i]==element){
                count++;
            }
            else{
                count--;
            }
            i++;
        }
        int b=0;
        for(int j=0;j<a.length;j++){
             if(a[j]==element){
                b++;
             }
        }
        if(b>a.length/2){
System.out.println(element);
        }
        else{
            System.out.println("-1");
        }
        
    }   
}