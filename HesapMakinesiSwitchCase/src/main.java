import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int number1,number2,select;
		
		Scanner input = new Scanner(System.in);
		System.out.println("1. Say� Giriniz: ");
		number1 = input.nextInt();
		System.out.println("2. Say� Giriniz: ");
		number2 = input.nextInt();
		
		
		
		System.out.println("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme");
		System.out.println("Se�iminiz nedir ? ");
		select = input.nextInt();
		
		switch(select){
		case 1:
			System.out.println(number1+number2);
			break;
		case 2:
			System.out.println(number1-number2);
			break;
		case 3:
			System.out.println(number1*number2);
			break;
		case 4:
			System.out.println(number1/number2);
			break;
			default:
				System.out.println("Yaln�� Se�im Yapt�n�z :");
		}
		
	}

}
