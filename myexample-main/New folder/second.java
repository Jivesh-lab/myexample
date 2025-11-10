import java.util.Scanner;

public class second {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter radius: ");
			if (!sc.hasNextDouble()) {
				System.out.println("Please enter a valid number for radius.");
				return;
			}
			double r = sc.nextDouble();
			double area = Math.PI * r * r;
			System.out.printf("Area of the circle with radius %.4f is %.4f%n", r, area);
		}
	}
}