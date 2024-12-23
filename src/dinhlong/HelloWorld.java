package dinhlong;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");

		int test = 5 + 9 * 3 - 10 / 2;
		// System.out.println("Check test : " + test);
		// System.out.println("Hello World 1");
		// System.out.printf("Hello World 2");
		System.out.print("Trần Đoàn ");
		System.out.println("Đình Long");
		System.out.printf("Có %.3f người đăng ký ", 40000.55);

		int age = 24;
		String name = "Đình Long";
		System.out.println("My age is : " + age + ", name : " + name);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Your name is : ");
		String name1 = scanner.nextLine();
		System.out.println("Yout age is : ");
		int age1 = scanner.nextInt();
		System.out.printf("Name : " + name1 + " , age : " + age1);
		scanner.close();// sau khi dùng thư viện nên đóng lại để tiết kiệm không gian bộ nhớ
	}
}
