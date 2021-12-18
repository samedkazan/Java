import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		double inpArmut,inpElma,inpDomates,inpMuz,inpPatlýcan;
		
		double Armut = 2.14;
		double Elma = 3.67; 
		double Domates = 1.11;
		double Muz = 0.95;
		double Patlýcan = 5.00;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Armut Kaç Kg ? ");
		inpArmut = input.nextDouble();
		
		System.out.println("Elma Kaç Kg ? ");
		inpElma = input.nextDouble();
		
		System.out.println("Domates Kaç Kg ? ");
		inpDomates = input.nextDouble();
		
		System.out.println("Muz Kaç Kg ? ");
		inpMuz = input.nextDouble();
		
		System.out.println("Patlýcan Kaç Kg ? ");
		inpPatlýcan = input.nextDouble(); 
		
		double hesaplama = (inpArmut * Armut)+(inpElma* Elma)+(inpDomates*Domates)+(inpMuz*Muz)+(inpPatlýcan*Patlýcan);
		
		System.out.print("Toplam tutarýnýz: "+hesaplama);
		
		
		

	}

}
