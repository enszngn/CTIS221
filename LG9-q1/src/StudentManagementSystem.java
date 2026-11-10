import java.util.Scanner;

public class StudentManagementSystem {
	private static final int MAX_CAPACITY = 5;
	private static Student[] students = new Student[MAX_CAPACITY];
	private static int count = 0;
	
	public static void addStudent() {
		Scanner input = new Scanner(System.in);
		String addNew = "Y";
		while (MAX_CAPACITY > count && addNew.equalsIgnoreCase("y")) {
			Student s = new Student();
			System.out.printf("Enter Student Id: ");
			int id = input.nextInt();
			while (searchStudentById(id) != -1) {
				System.out.println("Student ID already exists. Please enter a different ID");
				System.out.printf("Enter Student Id: ");
				id = input.nextInt();
			}
			s.setId(id);
			s.getInput();
			students[count] = s;
			count++;
			System.out.println("Student added successfully!");
			System.out.printf("Do you want to add another student? (Y/N): ");
			addNew = input.next();
		}
		if(count == MAX_CAPACITY) System.out.println("Maximum capacity of students reached.");
	}
	
	public static int searchStudentById(int id) {
		for(int i = 0; i < count; i++) {
			if(students[i].getId() == id)
				return i;
		}
		return -1;
	}
	
	public static Student searchStudent(int id) {
		for(int i = 0; i < count; i++) {
			if(students[i].getId() == id)
				return students[i];
		}
		return null;
	}
	
	public static double calculateAverageGPA() {
		if(count == 0)
			return 0;
		double total = 0;
		for(int i = 0; i < count; i++)
			total += students[i].getGpa();
		total /= (1.0 * count);
		return total;
	}
	
	public static void display() {
		System.out.println("----------------------\nHere is a list of the Students:");
		for(int i = 0; i < count; i++) {
			System.out.println(students[i].toString() + "\n");
		}
		System.out.println("\n\n\n" + "------------------\n" + "Avg of all student GPA's: " + calculateAverageGPA() + "\n------------------\n");
	}
}
