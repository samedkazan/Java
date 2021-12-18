import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int n1,n2,n3;

        Scanner input=new Scanner(System.in);

        System.out.print("1.Sayi: ");
        n1=input.nextInt();
        System.out.print("2.Sayi: ");
        n2=input.nextInt();
        System.out.print("3.Sayi: ");
        n3=input.nextInt();

        if( n1<n2 && n1<n3){
            if(n3<n2){
                System.out.println("1.sayi<3.sayi<2.sayi");

            }
            else if (n3==n2){
                System.out.println("1.sayi<3.sayi=2.sayi");

            }
            else
                System.out.println("1.sayi<2.sayi<3.sayi");

        }
        else if (n2<n3 && n2<n1){
            if(n3<n1){
                System.out.println("2.sayi<3.sayi<1.sayi");
            }
            else if (n3==n1){
                System.out.println("2.sayi<3.sayi=1.sayi");

            }
            else
                System.out.println("2.sayi<1.sayi<3.sayi");


        }
        else if (n3<n2 && n3<n1){
            if (n2<n1){
                System.out.println("3.sayi<2.sayi<1.sayi");
            }
            else if (n2==n1){
                System.out.println("3.sayi<1.sayi=2.sayi");
            }
            else
                System.out.println("3.sayi<1.sayi<2.sayi");
        }
        else if (n1==n2 && n1<n3){
            System.out.println("1.sayi=2.sayi<3.sayi");
        }
        else if (n1==n3 && n1<n2){
            System.out.println("1.sayi=3.sayi<2.sayi");
        }
        else if (n2==n3 && n2<n1){
            System.out.println("2.sayi=3.sayi<1.sayi");
        }
        else
            System.out.println("1.sayi=2.sayi=3.sayi");

	}

}
