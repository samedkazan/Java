import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// De�er alma k�sm�
		
		int mat,muzik,fizik,kimya,turkce,tarih;
			
		Scanner keyboard�nput = new Scanner(System.in);
		
		// De�er alma k�sm�
		
		System.out.print("Matematik dersi notunuz: ");
		mat = keyboard�nput.nextInt();
		
		System.out.print("Fizik dersi notunuz: ");
		fizik = keyboard�nput.nextInt();
		
		System.out.print("Kimya dersi notunuz: ");
		kimya = keyboard�nput.nextInt();
		
		System.out.print("T�rk�e dersi notunuz: ");
		turkce = keyboard�nput.nextInt();
		
		System.out.print("Tarih dersi notunuz: ");
		tarih = keyboard�nput.nextInt();
		
		System.out.print("M�zik dersi notunuz: ");
		muzik = keyboard�nput.nextInt();
		
		int toplam =(mat+fizik+kimya+turkce+muzik+tarih);
		double sonuc= toplam / 6.0;
		
		boolean ort = (sonuc>60);
		
		System.out.println("Ortalaman�z: " +sonuc);
		System.out.println("Ge�tiniz: "+ort);
		

	}

}
