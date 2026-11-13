import java.util.Scanner;

public class FoodOrder {
	private String restaurant;
	private String item;
	private double price;
	private static int orderCount = 0;
	private static int couponCount = 0;
	private static final double COUPON = 30;
	public FoodOrder() {
	}
	public static int getOrderCount() {
		return orderCount;
	}
	public static int getCouponCount() {
		return couponCount;
	}
	public void getInput() {
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter restaurant: ");
		restaurant = input.next();
		input.skip("\\R");
		System.out.printf("Enter the ordered item: ");
		item = input.nextLine();
		System.out.printf("Enter the price of the item: ");
		price = input.nextDouble();
		System.out.printf("\n");
		orderCount++;
	}
	public void applyCoupon() {
		if (price > COUPON && couponCount > 0) {
			price -= COUPON;
			couponCount--;
		}
	}
	public static boolean checkForCoupons() {
		if(orderCount % 2 == 0) {
			couponCount++;
			return true;
		}
		return false;
	}
	public String toString() {
		return "New price after applying coupon is " + price + " TL\n";
	}
	
}