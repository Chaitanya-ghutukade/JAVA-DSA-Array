public class Buyandsellstock {

    public static void main(String[] args){
        int[] prices={7,1,5,3,6,4};
        System.out.println(buyandsellstock(prices));

    }
    public static int buyandsellstock(int[] prices){

        int buyingprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buyingprice<prices[i]){
                int profit=prices[i]-buyingprice;
                maxprofit=Math.max(maxprofit,profit);
            }
            else {
                buyingprice=prices[i];
            }
        }
        return maxprofit;
    }

}


