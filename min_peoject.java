import java.util.Scanner;
import java.util.Scanner;
public class min_peoject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int usernumber=0;
		int mynumber=(int)(Math.random()*100);
		do {
			System.out.println("guess my number : (1-100)");
			usernumber=sc.nextInt();
			if(usernumber==mynumber) {
				System.out.println(" wha!!! correct");
			}
			else if(usernumber>mynumber)
				System.out.println(" your number is tooo Large");
			else {
				System.out.println("your number is small");
			}
				
			
		}
		while(usernumber>=0);
		
		System.out.println("my number is : ");
		System.out.println(mynumber);
	}
		

	

}
