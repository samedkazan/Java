import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int a,b,c;
		
	
		Scanner input = new Scanner(System.in);
		System.out.println("1. Kenarý Griniz: ");
		
		a = input.nextInt();
		
		System.out.println("2. Kenarý Griniz: ");
		b = input.nextInt();
		
		System.out.println("3. Kenarý Griniz: ");
		c = input.nextInt();
		
		double u = (a+b+c)/2;
		
		double alanxalan = u * (u - a) * (u - b) * (u - c);
		
		double alan = Math.sqrt(alanxalan);
		
		System.out.print("Üçgenin Alaný: " + alan);
		
	}

}
