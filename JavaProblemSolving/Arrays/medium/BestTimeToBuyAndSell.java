package Arrays.medium;

public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else{
                int max=prices[i]-min;
                if(max>profit){
                    profit=max;
                }
            }
        }
        System.out.println(profit);
    }
}
