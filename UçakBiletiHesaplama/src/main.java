import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		  	int km, age, type;
	        double perKm = 0.1;

	        Scanner input = new Scanner(System.in);

	        System.out.println("Please input your km");
	        km = input.nextInt();

	        System.out.println("Please input your age");
	        age = input.nextInt();

	        System.out.println("Please input your flight type (1 or 2)");
	        type = input.nextInt();

	        boolean condition = (km>=0 && age>=0 && (type==1 || type==2));
	        double totalPrice = km*perKm;

	        if(condition){
	            if(type==2){
	                if(age < 12){
	                    totalPrice = ((2*totalPrice)*0.8)/2;
	                }else if(age>=12 && age<24){
	                    totalPrice = ((2*totalPrice)*0.8)*0.9;
	                }else if(age>65){
	                    totalPrice = ((2*totalPrice)*0.8)*0.7;
	                }
	            }else if(type==1){
	                if(age < 12){
	                    totalPrice = totalPrice/2;
	                }else if(age>=12 && age<24){
	                    totalPrice = totalPrice*0.9;
	                }else if(age>65){
	                    totalPrice = totalPrice*0.7;
	                }
	            }
	        }
	        else{
	            System.out.println("Hatalý Veri Girdiniz!");

	        }
	        System.out.println("Toplam Tutar " +totalPrice + " TL");
		
		
		
		
	}

}
