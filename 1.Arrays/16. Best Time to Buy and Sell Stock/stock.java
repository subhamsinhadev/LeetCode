public class stock {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(Solution.maxProfit(arr));
    }
    
}
class Solution {
    public static int maxProfit(int[] prices) {
        int maxprofit=0;
        int n= prices.length;
        int buy_price=prices[0];
       
        for(int i=0;i<n;i++){

            if(prices[i]<buy_price){
                buy_price=prices[i];
            }else{

                int curpft=prices[i]-buy_price;
                maxprofit=Math.max(curpft,maxprofit);
            }
             

        }
        return maxprofit;

        }


}