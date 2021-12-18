
public class main {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        System.out.println("Please input your birth year");
	        int year = input.nextInt();
	        int result = year % 12;

	        switch (result){
	            case 0:
	                System.out.println("Çin Zodyaðý Burcunuz: Maymun");
	                break;
	            case 1:
	                System.out.println("Çin Zodyaðý Burcunuz: Horoz");
	                break;
	            case 2:
	                System.out.println("Çin Zodyaðý Burcunuz: Köpek");
	                break;
	            case 3:
	                System.out.println("Çin Zodyaðý Burcunuz: Domuz");
	                break;
	            case 4:
	                System.out.println("Çin Zodyaðý Burcunuz: Fare");
	                break;
	            case 5:
	                System.out.println("Çin Zodyaðý Burcunuz: Öküz");
	                break;
	            case 6:
	                System.out.println("Çin Zodyaðý Burcunuz: Kaplan");
	                break;
	            case 7:
	                System.out.println("Çin Zodyaðý Burcunuz: Tavsan");
	                break;
	            case 8:
	                System.out.println("Çin Zodyaðý Burcunuz: Ejderha");
	                break;
	            case 9:
	                System.out.println("Çin Zodyaðý Burcunuz: Yýlan");
	                break;
	            case 10:
	                System.out.println("Çin Zodyaðý Burcunuz: At");
	                break;
	            case 11:
	                System.out.println("Çin Zodyaðý Burcunuz: Koyun");
	                break;
	            default:
	                System.out.println("Girdiginiz Bilgiler Hatalý");
	        }

	}

}
