import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Deðer alma kýsmý
		
		int mat,muzik,fizik,kimya,turkce,tarih;
			
		Scanner keyboardÝnput = new Scanner(System.in);
		
		// Deðer alma kýsmý
		
		System.out.print("Matematik dersi notunuz: ");
		mat = keyboardÝnput.nextInt();
		
		System.out.print("Fizik dersi notunuz: ");
		fizik = keyboardÝnput.nextInt();
		
		System.out.print("Kimya dersi notunuz: ");
		kimya = keyboardÝnput.nextInt();
		
		System.out.print("Türkçe dersi notunuz: ");
		turkce = keyboardÝnput.nextInt();
		
		System.out.print("Tarih dersi notunuz: ");
		tarih = keyboardÝnput.nextInt();
		
		System.out.print("Müzik dersi notunuz: ");
		muzik = keyboardÝnput.nextInt();
		
		int toplam =(mat+fizik+kimya+turkce+muzik+tarih);
		double sonuc= toplam / 6.0;
		
		boolean ort = (sonuc>60);
		
		System.out.println("Ortalamanýz: " +sonuc);
		System.out.println("Geçtiniz: "+ort);
		

	}

}
