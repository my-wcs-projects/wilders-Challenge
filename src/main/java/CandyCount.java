public class CandyCount {
    public static void main(String[] args) {
        double realMoney = 12.4;
        double realPrice = 1.2;
        int candies = 0;

        if(realMoney > 0 && realPrice > 0) {
            while((realMoney - realPrice) >= 0) {
                candies = candies + 1;
                realMoney = realMoney - realPrice;
            }
        }
        System.out.println(candies);
    }
}