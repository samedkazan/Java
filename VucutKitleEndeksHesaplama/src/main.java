import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		double boy,kilo;
		Scanner input = new Scanner(System.in);
		System.out.print("Boy Giriniz: ");
		boy = input.nextDouble();
		System.out.print("kilo Giriniz: ");
		kilo = input.nextDouble();
		double hesaplama = kilo/(boy*boy);
		System.out.print("Vücut Kitle Endeksiniz: "+hesaplama);
	}

}
