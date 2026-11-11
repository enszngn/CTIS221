import java.util.Scanner;

public class RestaurantBillMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ifCheckBill;
		System.out.printf("Do you want to check the bill (Yes/No): ");
		ifCheckBill = input.nextLine();
		System.out.printf("\n");
		while (ifCheckBill.equalsIgnoreCase("Yes")) {
			RestaurantBill bill = new RestaurantBill();
			bill.getInput();
			System.out.printf("Do you want to check the bill (Yes/No): ");
			ifCheckBill = input.nextLine();
			System.out.printf("\n");
		}
		System.out.println("There are " + RestaurantBill.getCountOfBills() + " bills.");
	}

}
