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
		System.out.printf("Enter the ordered item: ");
		item = input.next();
		System.out.printf("Enter the price of the item: ");
		price = input.nextDouble();
		System.out.printf("\n");
	}
	public String toString() {
		return "FoodOrder [restaurant=" + restaurant + ", item=" + item + ", price=" + price + "]";
	}
	
}