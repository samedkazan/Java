import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		String userName,password,select;
		Scanner input= new Scanner(System.in);
		
		System.out.println("Kullan�c� Ad�n�z: ");
		userName = input.nextLine();
		
		System.out.println("�ifreniz: ");
		password = input.nextLine();
		
		if(userName.equals("Patika"))
		{
			if(password.equals("java1234")) 
			{
				System.out.println("Giri� Ba�ar�l�");
			}
			
			else
			{
				System.out.println("Kullan�c� ad�n�z do�ru �ifreniz hatal�...\n�ifrenizi s�f�rlamak �stermisiniz:\n1-Evet\n2-Hay�r");
				select = input.nextLine();
				if(select.equals("Evet") || select.equals("evet")) 
				{
					System.out.println("Yeni �ifrenizi giriniz...");
					password = input.nextLine();
					if(password.equals("java1234")) 
					{
						System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
					}
					else
					{
						System.out.println("�ifre olu�turuldu");
					}
				}
				
				else
				{
					System.out.println("Tekrar Giri� Yap�n�z...");
				}
			}
		}
		
		else 
		{
			System.out.println("Bilgilerniz Yaln��");
		}

	}

}
