import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StudentManagementSystem.addStudent();
		StudentManagementSystem.display();
		int searched;
		System.out.printf("Which student would you like to search? Enter his/her id: ");
		searched = input.nextInt();
		Student searchedStudent = StudentManagementSystem.searchStudent(searched);
		while (searchedStudent == null) {
		    System.out.println("This student does not exist.");
		    System.out.printf("Enter another ID: ");
		    searched = input.nextInt();
		    searchedStudent = StudentManagementSystem.searchStudent(searched);
		} 
			System.out.println("Here is a student you were looking for...");
			System.out.println(searchedStudent);
	}

}
