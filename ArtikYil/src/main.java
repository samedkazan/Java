import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);

	        System.out.println("Please input year: ");
	        int year = input.nextInt();

	        boolean condition1 = (year % 4) == 0;

	        if(condition1){
	            if((year%100) == 0){
	                if((year%400) == 0){
	                    System.out.println("Artýk Yýl " + year);
	                }else{
	                    System.out.println(year + " Artýk yýl degildir");
	                }
	            }else{
	                System.out.println("Artýk Yýl " +year);
	            }
	        }else{
	            System.out.println(year + " Artýk yýl degildir");
	        }

	}

}
