import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int matematik,fizik,turkce,kimya,muzik;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik Ders Notunuz: ");
		matematik = input.nextInt();
		int mat=(matematik>100 || matematik<0) ? 0:matematik;
		
		System.out.print("Fizik Ders Notunuz: ");
		fizik = input.nextInt();
		int fiz=(fizik>100 || fizik<0) ? 0:fizik;
		
		System.out.print("T�rk�e Ders Notunuz: ");
		turkce = input.nextInt();
		int tur=(turkce>100 || turkce<0) ? 0:turkce;
		
		System.out.print("Kimya Ders Notunuz: ");
		kimya = input.nextInt();
		int kim=(kimya>100 || kimya<0) ? 0:kimya;
		
		System.out.print("M�zik Ders Notunuz: ");
		muzik = input.nextInt();
		int muz=(muzik>100 || muzik<0) ? 0:muzik;
		
		int toplam = (mat+fiz+tur+kim+muz);

        double ort = toplam / 5.0;

        if (ort>=55&&ort<=100)
            System.out.println("Tebrikler...S�n�f� Ge�tiniz.");

        else if (ort>=0&&ort<55)
            System.out.println("S�n�fta Kald�n�z....");

        System.out.println("Ortalaman�z: "+ort);
		
		

	}

}
