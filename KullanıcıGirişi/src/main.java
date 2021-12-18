import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		String userName,password,select;
		Scanner input= new Scanner(System.in);
		
		System.out.println("Kullanýcý Adýnýz: ");
		userName = input.nextLine();
		
		System.out.println("Þifreniz: ");
		password = input.nextLine();
		
		if(userName.equals("Patika"))
		{
			if(password.equals("java1234")) 
			{
				System.out.println("Giriþ Baþarýlý");
			}
			
			else
			{
				System.out.println("Kullanýcý adýnýz doðru þifreniz hatalý...\nÞifrenizi sýfýrlamak Ýstermisiniz:\n1-Evet\n2-Hayýr");
				select = input.nextLine();
				if(select.equals("Evet") || select.equals("evet")) 
				{
					System.out.println("Yeni Þifrenizi giriniz...");
					password = input.nextLine();
					if(password.equals("java1234")) 
					{
						System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
					}
					else
					{
						System.out.println("Þifre oluþturuldu");
					}
				}
				
				else
				{
					System.out.println("Tekrar Giriþ Yapýnýz...");
				}
			}
		}
		
		else 
		{
			System.out.println("Bilgilerniz Yalnýþ");
		}

	}

}
