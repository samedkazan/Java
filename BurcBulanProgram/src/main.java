import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Dogdugunuz Ay: ");
        month = input.nextInt();

        System.out.println("Dogdugunuz G�n: ");
        day = input.nextInt();

        switch (month){
            case 1:
                if(day >= 1 && day <= 31){
                    if(day < 22){
                        burc = "Oglak";
                    } else{
                        burc = "Kova";
                    }
                }else{
                    isError = true;
                }
                break;
            case 2:
                if(day >= 1 && day <= 28){
                    if(day < 20){
                        burc = "Kova";
                    } else{
                        burc = "Bal�k";
                    }
                }else{
                    isError = true;
                }
                break;
            case 3:
                if(day >= 1 && day<= 31){
                    if(day < 21){
                        burc = "Bal�k";
                    } else{
                        burc = "Ko�";
                    }
                }else{
                    isError = true;
                }
                break;
            default:
                isError = true;
        }
        if(isError){
            System.out.println("Hatal� giri� yapt�n�z l�tfen tekrar deneyiniz");
        }else{
            System.out.println("Burcunuz: " + burc);
        }

	}

}
