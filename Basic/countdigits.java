public class countdigits {
     public static void main(String[] args) {
        int a=1234;
        int i=0;
        while(a!=0){
            a=a/10;
            i++;
        }
        System.out.println(i);
    }
}
