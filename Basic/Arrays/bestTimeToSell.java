package Arrays;
//you are given an array of stock 
//you must buy on one day and sell on another day
//find maximum profit
//if no profit return 0
public class bestTimeToSell {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int minPrice=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            else{
               int maxProfit=prices[i]-minPrice;
               if(maxProfit>profit){
                  profit=maxProfit;
               }
            }
        }
      System.out.println(profit);
    }
}
