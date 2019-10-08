package week5homework;

public class Driver {
	public static void main(String[] args) {
		GiftList giftList = new GiftList();
		
		for (int i=0; i<3; i++) {
			GiftBasket giftBasket = new GiftBasket();
			giftList.addGiftBasketToEnd(giftBasket);
		}
		
		giftList.showAllGiftBaskets();
	}
}
