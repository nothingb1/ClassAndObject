package advance.dev;

import java.util.Scanner;

public class MainApp {
	static void input(Student[]std) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < std.length; i++) {
			System.out.println("Sinh Vien Thu" + (i+1));
			std [i] = new Student();
			
			System.out.println("Name");
			std [i].name = sc.next();
			
			System.out.println("age");
			std [i].age = sc.nextInt();
			
			System.out.println("address");
			std [i].address = sc.next();
			
			System.out.println("phone");
			std [i].phone = sc.next();
			
			System.out.println("diemtrungBinh");
			std [i].diemTrungBinh = sc.nextDouble();


		}

	}
	static void print (Student[] std) {
		for (int i = 0; i < std.length; i++) {
			System.out.println(std[i].name + ":" + std[i].age + ":" + std[i].address 
					+ ":" + std[i].phone + ":" + std[i].diemTrungBinh );
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [] std = new Student [10];
		input (std);
		print (std);
		
	}
		
}