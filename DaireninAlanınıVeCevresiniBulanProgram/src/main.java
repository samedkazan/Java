import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int r,a;
		double pi =3.14;
		Scanner input = new Scanner(System.in);
		System.out.println("Yar� �ap Giriniz: ");
		
		r = input.nextInt();
		System.out.println("Merkez A�� �l��s� Giriniz: ");
		a = input.nextInt();
		
		double alan = (pi*(r*r)*a)/360;

		System.out.println(alan);
	}

}
