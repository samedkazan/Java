import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int r,a;
		double pi =3.14;
		Scanner input = new Scanner(System.in);
		System.out.println("Yarý Çap Giriniz: ");
		
		r = input.nextInt();
		System.out.println("Merkez Açý Ölçüsü Giriniz: ");
		a = input.nextInt();
		
		double alan = (pi*(r*r)*a)/360;

		System.out.println(alan);
	}

}
