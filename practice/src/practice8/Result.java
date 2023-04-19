package practice8;

public class Result {
    public int solution(int eatSheep, int eatDrink) {
        if (eatSheep / 10 > 0) {
            eatDrink -= eatSheep / 10;
        }
        int drinkPrice = 2000 * eatDrink;
        int sheepPrice = 12000 * eatSheep;
        int allprice = sheepPrice + drinkPrice;

        return allprice;
    }
}
