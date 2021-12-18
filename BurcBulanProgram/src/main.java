import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Dogdugunuz Ay: ");
        month = input.nextInt();

        System.out.println("Dogdugunuz Gün: ");
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
                        burc = "Balık";
                    }
                }else{
                    isError = true;
                }
                break;
            case 3:
                if(day >= 1 && day<= 31){
                    if(day < 21){
                        burc = "Balık";
                    } else{
                        burc = "Koç";
                    }
                }else{
                    isError = true;
                }
                break;
            default:
                isError = true;
        }
        if(isError){
            System.out.println("Hatalı giriş yaptınız lütfen tekrar deneyiniz");
        }else{
            System.out.println("Burcunuz: " + burc);
        }

	}

}
