package warmup;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		Book b = new Book();
		System.out.println("Enter the autor's name:");
		b.author = input.nextLine();
		System.out.println("Enter the title:");
		b.title = input.nextLine();
		System.out.println("Enter the type:");
		b.type = input.nextLine();
		System.out.println("Enter the price:");
		b.price = input.nextDouble();
		b.setBookInformation(b.author, b.title, b.type, b.price);
	}

}
