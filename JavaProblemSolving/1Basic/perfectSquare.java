public class perfectSquare {
    public static void main(String[] args) {
        //4 sqrt of 4 is 2=>2*2=4
        int a=11;
        boolean result=true;
        if(a<0){
            result=false;
        }
        else{
            int b=(int)Math.sqrt(a);
            if(b*b==a){
                result=true;
            }  
            else{
                result=false;
            }   
           }
        if(result==true){
            System.out.println("perfect square");
        }
        else{
            System.out.println("not a perfect square");
        }
    }
}
