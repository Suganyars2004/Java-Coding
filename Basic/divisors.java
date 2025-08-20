import java.util.ArrayList;
import java.util.Collections;

public class divisors {
        public static void main(String[] args) {
        int n=36;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                list.add(i);
                int a= n/i;
                if(a!=i){
                list.add(a);
                }
            }
        }
        Collections.sort(list);
        for(int i:list){
          System.out.print(i+" ");
}    }
}
