import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		double inpArmut,inpElma,inpDomates,inpMuz,inpPatl�can;
		
		double Armut = 2.14;
		double Elma = 3.67; 
		double Domates = 1.11;
		double Muz = 0.95;
		double Patl�can = 5.00;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Armut Ka� Kg ? ");
		inpArmut = input.nextDouble();
		
		System.out.println("Elma Ka� Kg ? ");
		inpElma = input.nextDouble();
		
		System.out.println("Domates Ka� Kg ? ");
		inpDomates = input.nextDouble();
		
		System.out.println("Muz Ka� Kg ? ");
		inpMuz = input.nextDouble();
		
		System.out.println("Patl�can Ka� Kg ? ");
		inpPatl�can = input.nextDouble(); 
		
		double hesaplama = (inpArmut * Armut)+(inpElma* Elma)+(inpDomates*Domates)+(inpMuz*Muz)+(inpPatl�can*Patl�can);
		
		System.out.print("Toplam tutar�n�z: "+hesaplama);
		
		
		

	}

}
