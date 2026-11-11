import java.util.Scanner;

public class RestaurantBill {
	private int tableNo;
	private String menuItem;
	private double size;
	private double price;
	private static int countOfBills;
	private final static double CHICKEN = 200;
	private final static double BEEF = 310;
	public RestaurantBill() {
	}
	public double getPrice() {
		return price;
	}
	public static int getCountOfBills() {
		return countOfBills;
	}
	public void getInput() {
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the table number: ");
		tableNo = input.nextInt();
		input.skip("\\R");
		System.out.printf("\nEnter the menu items' name: ");
		menuItem = input.nextLine();
		while(!(menuItem.equals("Chicken Wrap") || menuItem.equals("Beef Wrap"))) {
			System.out.printf("This item does not exist, please enter another item: ");
			menuItem =  input.nextLine();
		}
		System.out.printf("Enter the size in grams: ");
		size = input.nextDouble();
		calculateBill();
		System.out.printf("\nThe bill is %.1f TL\n\n", price);
		countOfBills++;
	}
	public void calculateBill() {
		if(menuItem.equals("Chicken Wrap")) {
			price = CHICKEN;
			if (size >= 180)
				price *= 1.7;
			else if (size >= 120)
				price *= 1.4;
		}
		else {
			price = BEEF;
			if (size >= 180)
				price *= 1.8;
			else if (size >= 120)
				price *= 1.4;
		}
	}
	public String toString() {
		return "RestaurantBill [tableNo=" + tableNo + ", menuItem=" + menuItem + ", size=" + size + ", price=" + price
				+ "]";
	}
	
	
}
