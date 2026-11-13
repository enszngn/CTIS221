import java.util.Scanner;

public class FoodOrderMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String newOrder;
		String couponUse = "no";
		FoodOrder order = new FoodOrder();
		System.out.printf("Do you want to place an order? (Yes/No): ");
		newOrder = input.next();
		System.out.println("");
		while(newOrder.equalsIgnoreCase("Yes")) {
			order.getInput();
			if(order.checkForCoupons())
				System.out.println("Congratulations! You won a coupon!\n");
			if(order.getCouponCount() > 0) {
				System.out.printf("Do you want to use a coupon? (Yes/No): ");
				couponUse = input.next();
				System.out.println("");
			}
			if(couponUse.equalsIgnoreCase("Yes")) {
				order.applyCoupon();
				System.out.println(order);
				System.out.println("");
			}
			System.out.printf("Do you want to place an order? (Yes/No): ");
			newOrder = input.next();
			System.out.println("");
		}
		System.out.println("You have made " + order.getOrderCount() + " orders.");
		System.out.println("You have " + order.getCouponCount() + " coupons left.");
	}
}
