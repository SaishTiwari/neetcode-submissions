 //Brute Force 
// class Solution {  
//     public int maxProfit(int[] prices) {

//         int maxProfit = 0;

//         for (int i = 0; i < prices.length; i++) {

//             for (int j = i + 1; j < prices.length; j++) {

//                 int profit = prices[j] - prices[i];

//                 if (profit > maxProfit) {
//                     maxProfit = profit;
//                 }
//             }
//         }

//         return maxProfit;
//     }
// }


class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}