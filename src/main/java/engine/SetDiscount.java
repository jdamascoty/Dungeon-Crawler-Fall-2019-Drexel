package katapotter;

public class SetDiscount {

	int discount;
	
	public int setDiscount(int distinctBooksSetLength) {
		switch (distinctBooksSetLength) {
		case 1:
			discount = 0;
			break;
		case 2:
			discount = 5;
			break;
		case 3:
			discount = 10;
			break;
		case 4:
			discount = 20;
			break;
		case 5:
			discount = 25;
			break;
		}
		return discount;
	}
}
